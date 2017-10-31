package cn.wxz1997.service;

import cn.wxz1997.entity.Resource;

public interface ResourceService {
    public Resource createResource(Resource resource);
    public void deleteResource(Long resourceId);
}
