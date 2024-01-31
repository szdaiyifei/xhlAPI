package com.xhl.xhlinterface;

import com.xhl.xhlapiclientsdk.client.XhlClient;
import com.xhl.xhlapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class XhlapiInterfaceApplicationTests {


    @Resource
    private XhlClient xhlClient;

    @Test
    void contextLoads() {
        String result = xhlClient.getNameByPost("xhl");
        System.out.println(result);
        User user = new User();
        user.setUserName("xhl1");

        String result1 = xhlClient.getUserNameByPost(user);
        System.out.println(result1);

    }

}
