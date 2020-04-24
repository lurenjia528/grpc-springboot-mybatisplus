package com.csse.grpc.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csse.grpc.common.Response;
import com.csse.grpc.model.BasUser;

/**
 * @author yanggt
 * @company csse
 * @date 2020/4/21
 */
public interface IUserService {

    /**
     * 添加用户
     *
     * @param user
     * @return
     */

    public Response addUser(BasUser user);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */

    public Response modifyUser(BasUser user);

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */

    public Response deleteUser(String userId);

    /**
     * 查询用户
     *
     * @param userId
     * @return
     */

    public Response getUser(String userId);

/**
 * 分页查询用户
 * @param searchName 支持根据姓名模糊搜索

 * @param page 分页参数

 * @return

 */

    public Response<Page<BasUser>>  getUserPage(String searchName, Page<BasUser> page);

}
