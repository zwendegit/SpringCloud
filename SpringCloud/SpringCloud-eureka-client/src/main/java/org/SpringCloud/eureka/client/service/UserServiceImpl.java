package org.SpringCloud.eureka.client.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.SpringCloud.eureka.client.bean.SpringUser;
import org.SpringCloud.eureka.client.dao.SpringUserMapper;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

	@Resource
	private SpringUserMapper mapper;
	
	public int save(SpringUser user) {
		return mapper.insertSelective(user);
	}

	@Override
	public List<SpringUser> getUserList(SpringUser user) {
		Map<String, Object> map=new HashMap<>();
		if(user.getId()!=null) map.put("id", user.getId());
		if(com.mysql.cj.util.StringUtils.isNullOrEmpty(user.getName())) map.put("name", user.getName());
		return mapper.getUserList(map);
	}
}
