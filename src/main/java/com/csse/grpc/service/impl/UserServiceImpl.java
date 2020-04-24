package com.csse.grpc.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csse.grpc.common.Response;
import com.csse.grpc.dao.BasUserMapper;
import com.csse.grpc.model.BasUser;
import com.csse.grpc.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yanggt
 * @company csse
 * @date 2020/4/21
 */

@Service("userService")
@Slf4j
public class UserServiceImpl implements IUserService {

    @Resource
    private BasUserMapper basUserMapper;

    @Override
    public Response<Boolean> addUser(BasUser basUser) {
//        BasUser basUser = new BasUser();
//        basUser.setUserId(UUID.randomUUID().toString());
//        basUser.setUserNo(user.getUserNo());
//        basUser.setUserName(user.getUserName());
//        basUser.setPersonName(user.getPersonName());
        Integer count = basUserMapper.insert(basUser);
        if (count > 0) {
            log.info("添加用户成功，用户信息：{}", basUser);
            return Response.successResult("添加用户成功", true);
        } else {
            log.error("添加用户失败，用户信息：{}", basUser);
            return Response.failResult("添加用户失败", false);
        }

    }

    @Override
    public Response<Boolean> modifyUser(BasUser user) {
        if (user == null) {
            log.error("修改用户时，用户信息不能为空'");
            return Response.failResult("用户信息不能为空");
        }
        String userId = user.getUserId();
        if (StringUtils.isBlank(userId)) {
            log.error("修改用户时，userId不能为空'");
            return Response.failResult("用户Id不能为空");
        }
        BasUser basUser = new BasUser();
        basUser.setUserId(userId);
        basUser.setUserNo(user.getUserNo());
        basUser.setUserName(user.getUserName());
        basUser.setPersonName(user.getPersonName());
        Integer count = basUserMapper.updateById(basUser);
        if (count > 0) {
            log.info("修改用户成功，用户信息：{}", basUser);
            return Response.successResult("修改用户成功", true);
        } else {
            log.error("修改用户失败，用户信息：{}", basUser);
            return Response.failResult("修改用户失败", false);
        }
    }

    @Override
    public Response<Boolean> deleteUser(String userId) {
        if (StringUtils.isBlank(userId)) {
            log.error("删除用户时，userId不能为空'");
            return Response.failResult("用户Id不能为空");
        }
        Integer count = basUserMapper.deleteById(userId);
        if (count > 0) {
            log.info("删除用户成功，用户Id：{}", userId);
            return Response.successResult("删除用户成功", true);
        } else {
            log.error("删除用户失败，用户id：{}", userId);
            return Response.failResult("删除用户失败", false);
        }
    }

    @Override
    public Response<BasUser> getUser(String userId) {
        if (StringUtils.isBlank(userId)) {
            log.error("查询用户信息时，userId不能为空'");
            return Response.failResult("用户Id不能为空");
        }
        BasUser basUser = basUserMapper.selectById(userId);
        if (basUser != null) {
            BasUser user = new BasUser();
            user.setUserId(basUser.getUserId());
            user.setUserNo(basUser.getUserNo());
            user.setUserName(basUser.getUserName());
            user.setUserHead(basUser.getUserHead());
            user.setPersonName(basUser.getPersonName());
            user.setPinyName(basUser.getPinyName());
            log.info("查询用户成功，用户Id：{}", userId);
            return Response.successResult("查询用户成功", user);
        } else {
            log.error("查询用户失败，用户Id：{}", userId);
            return Response.failResult("查询用户失败", null);
        }
    }

    @Override
    public Response<Page<BasUser>> getUserPage(String searchName, Page<BasUser> page) {
        List<BasUser> list = basUserMapper.selectUserPage(searchName, page);
        page.setRecords(list);
        return Response.successResult("查询成功", page);
    }
}
