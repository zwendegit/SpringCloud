package org.SpringCloud.eureka.client.bean;

import io.swagger.annotations.ApiParam;
import lombok.Data;
@Data
public class SpringUser {
	@ApiParam("id")
    private Integer id;
	@ApiParam("用户姓名")
    private String name;

}