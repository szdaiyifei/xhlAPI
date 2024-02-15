package com.xhl.xhlapicommon.service;

import com.xhl.xhlapicommon.model.entity.UserInterfaceInfo;
/**
 * @author szdaiyifei
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
 * @createDate 2024-01-31 20:58:14
 */
public interface InnerUserInterfaceInfoService{


    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
