package com.csse.grpc.grpccontroller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csse.grpc.dao.BasUserMapper;
import com.csse.grpc.generate.*;
import com.csse.grpc.model.BasUser;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yanggt
 * @company csse
 * @date 2020/4/22
 */
@GrpcService
public class GrpcController extends UserServiceGrpc.UserServiceImplBase {
    @Resource
    private BasUserMapper basUserMapper;

//    @Override
//    public void getUser(UserRequest request, StreamObserver<Response> responseObserver) {
//        String userId = request.getUserId();
//
//
//        BasUser basUser = basUserMapper.selectById(userId);
//        System.out.println(basUser);
//
//        Response response = Response
//                .newBuilder()
//                .setCode(ResponseCode.SUCCESS)
//                .setMsg("查询成功")
//                .setData(UserRequest.newBuilder()
//                        .setUserId(basUser.getUserId())
//                        .setUserNo(basUser.getUserNo())
//                        .setUserName(basUser.getUserName())
//                        .setUserHead(null == basUser.getUserHead() ? "" : basUser.getUserHead())
//                        .setPersonName(basUser.getPersonName())
//                        .setPinyName(basUser.getPinyName())
//                        .build())
//                .build();
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }

    @Override
    public void deleteUser(UserRequest request, StreamObserver<Response> responseObserver) {
        super.deleteUser(request, responseObserver);
    }

    @Override
    public void getUserAll(PageParam request, StreamObserver<AllUser> responseObserver) {
        System.out.println("------------------------");
        System.out.println("收到请求");
        System.out.println("------------------------");
        long pageNo = request.getPageNo();
        long pageSize = request.getPageSize();
        Page<BasUser> page = new Page<>();
        page.setCurrent(pageNo == 0 ? 1 : pageNo);
        page.setSize(pageSize == 0 ? 10 : pageSize);
        List<BasUser> records = basUserMapper.selectPage(page, null).getRecords();
        AllUser.Builder allUser = AllUser.newBuilder();
        allUser = allUser.setCode(ResponseCode.SUCCESS)
                .setMsg("查询成功");
        for (BasUser record : records) {
            allUser.addDataBuilder()
                    .setUserId(record.getUserId())
                    .setUserNo(record.getUserNo())
                    .setUserName(record.getUserName())
                    .setNickName(record.getNickName() == null ? "null" : record.getNickName())
                    .setUserHead(record.getUserHead() == null ? "null" : record.getUserHead())
                    .setPersonName(record.getPersonName() == null ? "null" : record.getPersonName())
                    .setPinyName(record.getPinyName() == null ? "null" : record.getPinyName())
                    .build();
        }
        responseObserver.onNext(allUser.build());
        responseObserver.onCompleted();
    }

    @Override
    public void get(Empty request, StreamObserver<Empty> responseObserver) {
        Empty build = Empty.newBuilder().build();
        System.out.println("kong");
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }
}
