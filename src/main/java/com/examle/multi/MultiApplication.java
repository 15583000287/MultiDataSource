package com.examle.multi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration   //标注一个类是配置类，spring boot在扫到这个注解时自动加载这个类相关的功能，比如前面的文章中介绍的配置AOP和拦截器时加在类上的Configuration
//启用自动配置 该框架就能够进行行为的配置，以引导应用程序的启动与运行, 根据导入的starter-pom 自动加载配置
@EnableJpaRepositories(basePackages={"com.examle.multi"})
//@EnableJpaRepositories(basePackages={"dao层对应的包路径"})
@ComponentScan(value={"com.*"})//扫描组件 @ComponentScan(value = "com.spriboot.controller") 配置扫描组件的路径
@SpringBootApplication
//@EntityScan("entity对应的包路径")
@EntityScan("com.examle.multi.entity")
public class MultiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiApplication.class, args);
    }

}
