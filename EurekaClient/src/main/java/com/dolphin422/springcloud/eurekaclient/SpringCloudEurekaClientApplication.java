package com.dolphin422.springcloud.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DamonJT
 * @description
 * @createDate 2019.04.25 14:51
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientApplication.class, args);
    }
}


