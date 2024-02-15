package com.xhl.xhlapicommon.service;

import com.xhl.xhlapicommon.model.entity.InterfaceInfo;

/**
 * @author szdaiyifei
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2024-01-04 22:19:06
 */
public interface InnerInterfaceInfoService{

    /**
     * 从数据库中查询是否存在接口
     *
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
