package cn.wxz1997.entity;

import java.io.Serializable;

/**
 *
 * 角色资源
 *
 */
public class RoleResource implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 主键id */
	private Long id;

	/** 角色id */
	private Long roleId;

	/** 资源id */
	private Long resourceId;

	public RoleResource() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	@Override
	public String toString() {
		return "RoleResource{" +
				"id=" + id +
				", roleId=" + roleId +
				", resourceId=" + resourceId +
				'}';
	}
}
