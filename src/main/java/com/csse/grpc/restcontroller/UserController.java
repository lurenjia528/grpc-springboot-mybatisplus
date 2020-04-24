package com.csse.grpc.restcontroller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csse.grpc.common.Response;
import com.csse.grpc.model.BasUser;
import com.csse.grpc.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yanggt
 * @company csse
 * @date 2020/4/21
 */
@Slf4j
@RestController
@RequestMapping("/2")
public class UserController {
    @Resource
    private IUserService userService;

    @GetMapping("/3")
    public String t(){
        return "ok";
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/user/add")
    public Response<Boolean> addUser(@RequestBody BasUser user) {
        if (null == user) {
            log.error("添加用户时，用户信息不能为空'");
            return Response.failResult("用户信息不能为空");
        }
        String personName = user.getPersonName();
        System.out.println(user.toString());
        if (StringUtils.isBlank(personName)) {
            log.error("添加用户时，personName不能为空'");
            return Response.failResult("用户姓名不能为空");
        }
        return userService.addUser(user);
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @PostMapping("/user/modify")
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
        return userService.modifyUser(user);
    }

    /**
     * 删除用户
     * @param userId
     * @return
     */
    @PostMapping("/user/delete")
    public Response<Boolean> deleteUser(String userId) {
        if (StringUtils.isBlank(userId)) {
            log.error("删除用户时，userId不能为空'");
            return Response.failResult("用户Id不能为空");
        }
        return userService.deleteUser(userId);
    }

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    @PostMapping("/user/info")
    public Response<BasUser> getUser(String userId) {
        if (StringUtils.isBlank(userId)) {
            log.error("查询用户信息时，userId不能为空'");
            return Response.failResult("用户Id不能为空");
        }
        return userService.getUser(userId);
    }

    /**
     * 分页查询用户列表
     * @param searchName 可为空
     * @param pageNo 可为空 默认为1
     * @param pageSize 可为空 默认为10
     * @return
     */
    @PostMapping("/user/page")
    public Response<Page<BasUser>> getUserPage(String searchName, String pageNo,String pageSize) {
        Page<BasUser> page = new Page<>();
        if(StringUtils.isNotBlank(pageNo)){
            page.setCurrent(Long.parseLong(pageNo));
        }
        if(StringUtils.isNotBlank(pageSize)){
            page.setSize(Long.parseLong(pageSize));
        }
        return userService.getUserPage(searchName,page);
    }
}
