package com.csse.grpc.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;

/**
 * @author yanggt
 * @company csse
 * @date 2020/4/24
 */
//@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * 新增的时候自动填充
     *
     * @param metaObject 元数据
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.setFieldValByName("userHead", "", metaObject);
        this.setFieldValByName("nickName", "", metaObject);
        this.setFieldValByName("personName", "", metaObject);
        this.setFieldValByName("pinyName", "", metaObject);
    }

    /**
     * 更新的时候自动填充
     *
     * @param metaObject 元数据
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.setFieldValByName("userHead", "", metaObject);
        this.setFieldValByName("nickName", "", metaObject);
        this.setFieldValByName("personName", "", metaObject);
        this.setFieldValByName("pinyName", "", metaObject);
    }
}

