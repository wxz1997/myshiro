package cn.wxz1997.service.impl;

import cn.wxz1997.dao.RoleDao;
import cn.wxz1997.entity.Role;
import cn.wxz1997.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleDao roleDao;

    @Override
    public Role createRole(Role role) {
        return null;
    }

    @Override
    public void deleteRole(Long roleId) {

    }

    @Override
    public void correlationResources(Long roleId, Long... ResourceIds) {

    }

    @Override
    public void uncorrelationResources(Long roleId, Long... ResourceIds) {

    }
}
