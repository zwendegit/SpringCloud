package org.SpringCloud.eureka.client.controller;

import java.util.List;

import javax.annotation.Resource;

import org.SpringCloud.eureka.client.bean.SpringUser;
import org.SpringCloud.eureka.client.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value = "swagger测试", tags = { "测试接口" })
@RestController
@RequestMapping("test")
public class TestController {

	
	@Resource
	private UserService userService;
	
	@GetMapping("/hello")
    public String index() {
        return "Hello World";
    }
	
	
	@ApiOperation("保存用户信息")
	@GetMapping("/save")
    public void save(SpringUser user) {
		if(user==null) user=new SpringUser();
		userService.save(user);
    }
	
	@ApiOperation("获取用户信息")
	@GetMapping("/userList")
    public List<SpringUser> userList(SpringUser user) {
		List<SpringUser> userList= userService.getUserList(user);
		return userList;
    }
}
