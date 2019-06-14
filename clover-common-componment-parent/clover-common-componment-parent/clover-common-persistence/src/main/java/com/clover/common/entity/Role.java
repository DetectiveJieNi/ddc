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
@TableName("role")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名称
     */
    @TableId("id")
    private String roleId;

    /**
     * 角色代号主键
     */
    @TableField("name")
    private String roleName;

    @TableField("insert_name")
    private String insertName;

    @TableField("insert_time")
    private String insertTime;

    @TableField("update_name")
    private String updateName;

    @TableField("update_time")
    private String updateTime;

    @TableField("delete_atg")
    private Integer deleteTag;

    private String remark;

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

}
