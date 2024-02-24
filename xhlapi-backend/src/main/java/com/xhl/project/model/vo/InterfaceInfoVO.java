package com.xhl.project.model.vo;

import com.xhl.xhlapicommon.model.entity.InterfaceInfo;
import lombok.Data;

@Data
public class InterfaceInfoVO extends InterfaceInfo {
    private static final long serialVersionUID = 1L;

    /**
     * 调用次数
     */
    private Integer totalNum;
}
