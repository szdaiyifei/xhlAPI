package com.xhl.project.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * @author 小火龙
 * @date 2024/1/31
 */

@SpringBootTest
public class UserInterfaceInfoServiceTest {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void invokeCount() {

        // 调用了userInterfaceInfoService的invokeCount方法，并传入两个参数(1L, 1L)
        boolean b = userInterfaceInfoService.invokeCount(1L, 1L);
        // 表示断言b的值为true，即测试用例期望invokeCount方法返回true
        Assertions.assertTrue(b);
    }
}