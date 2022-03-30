package org.SpringCloud.eureka.client;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
//添加扫描mapping
@MapperScan("org.SpringCloud.eureka.client.dao")
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    	
    }
}
