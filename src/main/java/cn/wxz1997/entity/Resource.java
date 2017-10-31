package cn.wxz1997.entity;

import java.io.Serializable;

/**
 *
 * 资源
 *
 */
public class Resource implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 主键 */
	private Long id;

	/** 资源名称 */
	private String name;

	/** 资源路径 */
	private String url;

	/** 资源类型，菜单或按钮 */
	private String type;

	/** 资源权限 */
	private String permission;


	/** 父级资源id */
	private Long parentId;

	public Resource() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "Resource{" +
				"id=" + id +
				", name='" + name + '\'' +
				", url='" + url + '\'' +
				", type='" + type + '\'' +
				", permission='" + permission + '\'' +
				", parentId=" + parentId +
				'}';
	}
}
