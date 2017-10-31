package cn.wxz1997.dao;

import cn.wxz1997.entity.Role;

public interface RoleDao {
    Role createRole(Role role);
    void deleteRole(Long roleId);

    void correlationResources(Long roleId, Long... resourceIds);
    void uncorrelationResources(Long roleId, Long... resourceIds);

}
