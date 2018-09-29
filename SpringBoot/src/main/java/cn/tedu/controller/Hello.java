package cn.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	//打印Hrllo，返回json  RESTFul+json(常用方式)
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		return "hello "+name;
	}
}
