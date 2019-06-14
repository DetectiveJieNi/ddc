package com.clover.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("grant")
public class Grant extends Model <Grant> {
    private static final long serialVersionUID = 1L;

    @TableId("id")
    private  String grantId;

    @TableField("root_id")
    private String rootId;

    @TableField("role_id")
    private String roleId;

    @Override
    protected Serializable pkVal() {
        return this.grantId;
    }
}
