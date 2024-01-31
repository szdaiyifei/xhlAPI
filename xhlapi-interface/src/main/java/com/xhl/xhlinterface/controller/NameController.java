package com.xhl.xhlinterface.controller;

import com.xhl.xhlapiclientsdk.model.User;
import com.xhl.xhlapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 小火龙
 * @date 2024/1/26
 */

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "Get 你的名字是:" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "Post 你的名字是:" + name;

    }

    @PostMapping("/user")
    public String getNameByUser(@RequestBody User user, HttpServletRequest request) {
        // 从请求头中获取参数
        String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");

        // todo 实际情况应该是去数据库中查是否已分配给用户
        if (!accessKey.equals("xhl")) {
            throw new RuntimeException("无权限");
        }

        String genSign = SignUtils.genSign(body, "abcdefgh");
        if (!sign.equals(genSign)) {
            throw new RuntimeException("签名错误");
        }

        return "Post 你的名字是:" + user.getUserName();
    }
}
