package cn.wxz1997.service;

import cn.wxz1997.entity.Role;

public interface RoleService {
    public Role createRole(Role role);
    public void deleteRole(Long roleId);

    /**
     * 添加角色-权限之间关系
     */
    public void correlationResources(Long roleId, Long... ResourceIds);

    /**
     * 移除角色-权限之间关系
     */
    public void uncorrelationResources(Long roleId, Long... ResourceIds);
}
