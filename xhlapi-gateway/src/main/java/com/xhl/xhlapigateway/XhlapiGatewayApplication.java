package com.xhl.xhlapigateway;

import com.xhl.project.provider.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;


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


}
