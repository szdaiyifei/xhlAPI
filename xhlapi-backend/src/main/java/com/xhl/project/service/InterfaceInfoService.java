package com.xhl.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhl.xhlapicommon.model.entity.InterfaceInfo;

/**
 * @author szdaiyifei
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2024-01-04 22:19:06
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
