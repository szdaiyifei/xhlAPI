package com.xhl.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhl.xhlapicommon.model.entity.UserInterfaceInfo;
/**
 * @author szdaiyifei
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
 * @createDate 2024-01-31 20:58:14
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);


    boolean invokeCount(long interfaceInfoId, long userId);


    Long getInvokeCount(long interfaceInfoId, long userId);
}
