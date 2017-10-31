package cn.wxz1997.dao;

import cn.wxz1997.entity.Resource;

public interface ResourceDao {
    public Resource createResource(Resource resource);

    public void deleteResource(Long resourceId);
}
