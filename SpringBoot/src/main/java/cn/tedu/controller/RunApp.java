package cn.tedu.controller;//SpringBoot工程启动类必须在所有类父级目录中,必须包含路径

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类,执行这个类的main方法
@SpringBootApplication // 标识这个类是SpringBoot的启动类
public class RunApp {
	public static void main(String[] args) {
		//需要Spring环境servlet运行环境
		SpringApplication.run(RunApp.class, args);
	}
}
