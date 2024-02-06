package com.xhl.xhlapigateway;

import com.xhl.project.provider.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@EnableDubbo
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
public class XhlapiGatewayApplication {

    @DubboReference
    private DemoService demoService;

    public static void main(String[] args) {
        ConfigurableApplicationContext content = SpringApplication.run(XhlapiGatewayApplication.class, args);
        XhlapiGatewayApplication application = content.getBean(XhlapiGatewayApplication.class);
        String result = application.demoService.sayHello("xhlapi");
        String result1 = application.demoService.sayHello2("xhlapi1");
        System.out.println("result:" + result);
        System.out.println("result1:" + result1);

    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        // 创建路由规则的构建器
//        return builder.routes()
//                // 定义路由规则，给该规则起一个名字 "tobaidu"
//                .route("tobaidu", r -> r.path("/baidu")
//                        // 将满足 "/baidu" 路径的请求转发到 "https://www.baidu.com"
//                        .uri("https://www.baidu.com"))
//                // 定义路由规则，给该规则起一个名字 "toyupiicu"
//                .route("toyupiicu", r -> r.path("/yupiicu")
//                        // 将满足 "/yupiicu" 路径的请求转发到 "http://yupi.icu"
//                        .uri("http://yupi.icu"))
//                // 创建并返回路由规则配置对象
//                .build();
//    }

}
