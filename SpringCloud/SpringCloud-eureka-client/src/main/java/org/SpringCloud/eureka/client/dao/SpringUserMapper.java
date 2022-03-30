package org.SpringCloud.eureka.client.dao;

import java.util.List;
import java.util.Map;

import org.SpringCloud.eureka.client.bean.SpringUser;


public interface SpringUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SpringUser record);

    int insertSelective(SpringUser record);

    SpringUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpringUser record);

    int updateByPrimaryKey(SpringUser record);
    
    List<SpringUser> getUserList(Map<String, Object> map);
}