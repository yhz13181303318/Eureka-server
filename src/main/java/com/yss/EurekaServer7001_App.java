package com.yss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
@SpringBootApplication
@EnableEurekaServer    // EurekaServer服务器端启动类,接受其它微服务注册进来,指定它作为服务注册中心
@EnableWebSecurity     // 启动祖册中心开启验证功能
public class EurekaServer7001_App {

	public static void main(String[] args) {

		SpringApplication.run(EurekaServer7001_App.class, args);
	}

}
