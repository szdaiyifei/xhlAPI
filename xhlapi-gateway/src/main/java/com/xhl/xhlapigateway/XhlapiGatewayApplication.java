package com.xhl.xhlapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class XhlapiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(XhlapiGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        // 创建路由规则的构建器
        return builder.routes()
                // 定义路由规则，给该规则起一个名字 "tobaidu"
                .route("tobaidu", r -> r.path("/baidu")
                        // 将满足 "/baidu" 路径的请求转发到 "https://www.baidu.com"
                        .uri("https://www.baidu.com"))
                // 定义路由规则，给该规则起一个名字 "toyupiicu"
                .route("toyupiicu", r -> r.path("/yupiicu")
                        // 将满足 "/yupiicu" 路径的请求转发到 "http://yupi.icu"
                        .uri("http://yupi.icu"))
                // 创建并返回路由规则配置对象
                .build();
    }

}
