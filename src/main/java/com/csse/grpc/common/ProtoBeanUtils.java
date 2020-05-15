package com.csse.grpc.common;

import com.csse.grpc.generate.UserRequest;
import com.csse.grpc.model.BasUser;
import com.google.gson.Gson;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

import java.io.IOException;

/**
 * @see https://segmentfault.com/a/1190000020288933
 * @see https://donespeak.gitlab.io/posts/190827-protobuf-json-interconvert/
 * 相互转化的两个对象的getter和setter字段要完全的匹配。
 * 此外，对于ProtoBean中的enum和bytes，与POJO转化时遵循如下的规则：
 * <ol>
 *     <li>enum -> String</li>
 *     <li>bytes -> base64 String</li>
 * </ol>
 *
 * @author yanggt
 * @company csse
 * @date 2020/5/16
 */
public class ProtoBeanUtils {

    /**
     * 将ProtoBean对象转化为POJO对象
     *
     * @param destPojoClass 目标POJO对象的类类型
     * @param sourceMessage 含有数据的ProtoBean对象实例
     * @param <PojoType>    目标POJO对象的类类型范型
     * @return
     * @throws IOException
     */
    public static <PojoType> PojoType toPojoBean(Class<PojoType> destPojoClass, Message sourceMessage)
            throws IOException {
        if (destPojoClass == null) {
            throw new IllegalArgumentException
                    ("No destination pojo class specified");
        }
        if (sourceMessage == null) {
            throw new IllegalArgumentException("No source message specified");
        }
        String json = JsonFormat.printer().print(sourceMessage);
        return new Gson().fromJson(json, destPojoClass);
    }

    /**
     * 将POJO对象转化为ProtoBean对象
     *
     * @param destBuilder    目标Message对象的Builder类
     * @param sourcePojoBean 含有数据的POJO对象
     * @return
     * @throws IOException
     */
    public static void toProtoBean(Message.Builder destBuilder, Object sourcePojoBean) throws IOException {
        if (destBuilder == null) {
            throw new IllegalArgumentException
                    ("No destination message builder specified");
        }
        if (sourcePojoBean == null) {
            throw new IllegalArgumentException("No source pojo specified");
        }
        String json = new Gson().toJson(sourcePojoBean);
        JsonFormat.parser().merge(json, destBuilder);
    }

    public static void main(String[] args) throws IOException {

        UserRequest.Builder builder = UserRequest.newBuilder();
        UserRequest build = builder.setNickName("test nick").build();
        BasUser basUser1 = toPojoBean(BasUser.class, build);
        System.out.println(basUser1);

        BasUser basUser = new BasUser();
        basUser.setUserId("test id");
        UserRequest.Builder builder1 = UserRequest.newBuilder();
        toProtoBean(builder1, basUser);
        UserRequest build1 = builder1.build();
        System.out.println(build1);
    }
}
