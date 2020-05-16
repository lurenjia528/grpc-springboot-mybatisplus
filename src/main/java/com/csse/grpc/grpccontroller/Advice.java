//package com.csse.grpc.grpccontroller;
//
//import com.alibaba.fastjson.JSONObject;
//import com.google.protobuf.CodedInputStream;
//import io.grpc.reflection.v1alpha.ErrorResponse;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import org.springframework.util.Assert;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@Component
//@RestControllerAdvice
//@Slf4j
//public class Advice {
//
//    /**
//     * 未定义异常
//     *
//     * @param e 异常
//     * @return 异常结果
//     */
//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    public JSONObject handleException(Exception e) {
//        log.error(e.getMessage(), e);
//        System.out.println("controller advice");
//        JSONObject jo = new JSONObject();
//        jo.put("error", 500);
//        return jo;
//    }
//}
//
