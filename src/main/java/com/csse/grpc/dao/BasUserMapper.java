package com.csse.grpc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csse.grpc.generate.UserRequest;
import com.csse.grpc.model.BasUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yanggt
 * @company csse
 * @date 2020/4/21
 */
public interface BasUserMapper extends BaseMapper<BasUser> {

    /**
     * 分页查询用户
     * @param searchName
     * @param page
     * @return
     */
    public List<BasUser> selectUserPage(@Param("searchName")String searchName, Page<BasUser> page);
     UserRequest.Builder selectOneUser();
}