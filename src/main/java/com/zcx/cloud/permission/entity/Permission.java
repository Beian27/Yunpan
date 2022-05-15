package com.zcx.cloud.permission.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDateTime;
import com.zcx.cloud.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author zcx
 * @since 2020-01-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_permission")
public class Permission extends BaseEntity implements Serializable{
	/**
	 * 注意：Shiro Session存储在Redis中，Session会被序列化，那么伴随的用户都会被序列化
	 * 所以此UID值不能与其它相同，否则会序列化失败
	 */
    private static final long serialVersionUID = 4389709495352400087L;


    @TableId(value = "permission_id", type = IdType.AUTO)
    private Long permissionId;

    private String permissionName;

    private String permissionCode;

    private String permissionDescribe;
}
