package com.csse.grpc.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yanggt
 * @company csse
 * @date 2020/4/21
 */
@Data
@TableName(value = "grpc.bas_user")
public class BasUser {
    @TableField
    @TableId(value = "user_id")
    private String userId;
    @TableField
    private String userNo;
    @TableField
    private String userName;
    @TableField
    private String userHead;
    @TableField
    private String nickName;
    @TableField
    private String personName;
    @TableField
    private String pinyName;
}
