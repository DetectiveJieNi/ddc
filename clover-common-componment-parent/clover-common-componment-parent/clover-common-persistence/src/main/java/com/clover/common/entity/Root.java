package com.clover.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 角色表
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
@TableName("root")
public class Root extends Model<Root> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名称
     */
    @TableId("id")
    private String rootId;

    /**
     * 角色代号主键
     */
    @TableField("name")
    private String rootName;

    @TableField("pre_id")
    private String preId;

    @TableField("root_tag")
    private String rootTag;

    private Integer level;

    @TableField("insert_name")
    private String insertName;

    @TableField("insert_time")
    private String insertTime;

    @TableField("update_name")
    private String updateNname;

    @TableField("update_time")
    private String updateTime;

    @TableField("delete_atg")
    private Integer deleteTag;

    @Override
    protected Serializable pkVal() {
        return this.rootId;
    }

}

