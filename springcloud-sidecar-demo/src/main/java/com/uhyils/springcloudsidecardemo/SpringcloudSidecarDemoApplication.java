package com.uhyils.springcloudsidecardemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SpringcloudSidecarDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSidecarDemoApplication.class, args);
    }

}
