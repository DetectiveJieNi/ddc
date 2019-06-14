package com.clover.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author dingpengfei
 * @since 2019-05-09
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("manager")
public class Admin extends Model<Admin> {

    private static final long serialVersionUID = 1L;
    /**
     * 用户主键
     */
    @TableId("id")
    private String manageId;
    /**
     * 姓名
     */
    @TableField("name")
    private String manageName;
    /**
     * 密码
     */
    @TableField("password")
    private String password;

    private String email;
    /**
     * 角色id
     */
    @TableField("role_id")
    private String roleId;

    private String phone;

    @TableField("insert_time")
    private String insertTime;

    private Integer sex;

    @TableField("insert_man")
    private String insertMan;

    @TableField("update_man")
    private String updateMan;

    @TableField("update_time")
    private String updateTime;

    private Integer status;

    private Integer delete;

    private String remark;




    /**
     * 创建时间
     */
   /* @TableField("create_time")
    private Long createTime;
    /**
     * 头像
     */
   /* private String avatar;
    /**
     * 状态值（1：启用，2：禁用，3：删除）
     */
    /*private Integer status;
    /**
     * 职位

    private String job;


    @TableField(exist = false)
    private String token;

    @TableField(exist = false)
    private String roleName;*/


    @Override
    protected Serializable pkVal() {
        return this.manageId;
    }

  public static void main(String[] args) {
//    HMac md5Digest=new HMac();
//    md5Digest.update(Byte.parseByte(("hello"+"123")));
//    System.out.println(md5Digest.);
  }
}
