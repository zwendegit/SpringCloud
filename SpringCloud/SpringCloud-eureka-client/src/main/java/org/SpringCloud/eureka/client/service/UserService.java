package org.SpringCloud.eureka.client.service;


import java.util.List;

import org.SpringCloud.eureka.client.bean.SpringUser;


public interface UserService {

	int save(SpringUser user);
	
	List<SpringUser> getUserList(SpringUser user);
}
