# 编译
```bash
protoc --plugin=protoc-gen-grpc-java=/home/ht061/gocode/bin/protoc-gen-grpc-java --grpc-java_out=src/main/java/ --java_out=src/main/java/  --plugin=protoc-gen-doc=/home/ht061/gocode/bin/protoc-gen-doc --doc_out=./doc --doc_opt=html,index.html src/main/proto/user.proto
```

# 生成文档
```bash
proto-gen-doc 

https://github.com/pseudomuto/protoc-gen-doc/
```

# 测试
```bash
# 查看暴露的所有服务
$ grpcurl -plaintext 127.0.0.1:9090 list 
UserService
grpc.health.v1.Health
grpc.reflection.v1alpha.ServerReflection

# 列举服务中的方法
$ grpcurl -plaintext 127.0.0.1:9090 list grpc.health.v1.Health
grpc.health.v1.Health.Check
grpc.health.v1.Health.Watch

$ grpcurl -plaintext 127.0.0.1:9090 list UserService
UserService.DeleteUser
UserService.GetUser
UserService.GetUserAll

# 查看服务详情
$ grpcurl -plaintext 127.0.0.1:9090 describe UserService
UserService is a service:
service UserService {
  rpc DeleteUser ( .UserRequest ) returns ( .Response );
  rpc GetUser ( .UserRequest ) returns ( .Response );
  rpc GetUserAll ( .PageParam ) returns ( .AllUser );
}
$ grpcurl -plaintext 127.0.0.1:9090 describe grpc.health.v1.Health.Check
grpc.health.v1.Health.Check is a method:
rpc Check ( .grpc.health.v1.HealthCheckRequest ) returns ( .grpc.health.v1.HealthCheckResponse );


$ grpcurl -plaintext  -d '{"userId":"00f1173c-7bce-49a3-aa61-12e5893eeec6"}' 127.0.0.1:9090 UserService/GetUser
{
  "code": "SUCCESS",
  "msg": "查询成功",
  "data": {
    "userId": "00f1173c-7bce-49a3-aa61-12e5893eeec6",
    "userNo": "chengzi",
    "userName": "chengzi",
    "userHead": "head1",
    "personName": "czz",
    "pinyName": "qweqwe"
  }
}

$  grpcurl -plaintext  127.0.0.1:9090 UserService/GetUserAll
{
  "code": "SUCCESS",
  "msg": "查询成功",
  "data": [
    {
      "userId": "00f1173c-7bce-49a3-aa61-12e5893eeec6",
      "userNo": "chengzi",
      "userName": "chengzi",
      "userHead": "head1",
      "nickName": "qwe",
      "personName": "czz",
      "pinyName": "qweqwe"
    },
    {
      "userId": "25186140-8957-4086-932a-bfb974c51a0d",
      "userNo": "chengzi",
      "userName": "chengzi",
      "userHead": "head2",
      "nickName": "asd",
      "personName": "czz",
      "pinyName": "asdasd"
    }
  ]
}


$  grpcurl -plaintext  -d '{"pageNo":1,"pageSize":1}' 127.0.0.1:9090 UserService/GetUserAll
{
  "code": "SUCCESS",
  "msg": "查询成功",
  "data": [
    {
      "userId": "00f1173c-7bce-49a3-aa61-12e5893eeec6",
      "userNo": "chengzi",
      "userName": "chengzi",
      "userHead": "head1",
      "nickName": "qwe",
      "personName": "czz",
      "pinyName": "qweqwe"
    }
  ]
}

```
# 健康检查
```bash
$ grpcurl -plaintext 127.0.0.1:9090  grpc.health.v1.Health/Check
{
  "status": "SERVING"
}
```