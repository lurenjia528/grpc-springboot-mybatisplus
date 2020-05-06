package com.csse.grpc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ht061
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.csse.grpc.service","com.csse.grpc.dao"})
public class GrpcApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcApplication.class, args);
    }

}
