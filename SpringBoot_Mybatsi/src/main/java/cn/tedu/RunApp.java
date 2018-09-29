package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication //标识是一个SpringBoot的启动类，会先创建Spring环境
@MapperScan(basePackages="cn.tedu.mapper")
public class RunApp {
	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);
	}
}
