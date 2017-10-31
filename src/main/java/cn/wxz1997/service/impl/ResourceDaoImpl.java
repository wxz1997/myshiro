package cn.wxz1997.service.impl;

import cn.wxz1997.dao.ResourceDao;
import cn.wxz1997.entity.Resource;
import cn.wxz1997.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceDaoImpl implements ResourceService{
    @Autowired
    private ResourceDao resourceDao;

    @Override
    public Resource createResource(Resource resource) {
        return null;
    }

    @Override
    public void deleteResource(Long resourceId) {

    }
}
