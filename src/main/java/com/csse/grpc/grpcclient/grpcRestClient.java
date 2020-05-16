//package com.csse.grpc.grpcclient;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author yanggt
// * @company csse
// * @date 2020/4/22
// */
//@RestController
//@RequestMapping("/1")
//public class grpcRestClient {
//    @Autowired
//    private GrpcClientController grpcClientController;
//
//    @GetMapping("/grpc")
//    public String grpc() {
//        System.out.println("开始请求grpc");
//        String s = grpcClientController.sendMessage();
//        return s;
//    }
//}
