package com.csse.grpc.dockertest;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Version;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;

/**
 * @author yanggt
 * @company csse
 * @date 2020/4/26
 */
public class Test {
    public static void main(String[] args) {

        DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder()
                .withDockerHost("tcp://127.0.0.1:4243")
//                .withDockerTlsVerify(true)
//                .withDockerCertPath("/home/ht061/.docker/tls")
//                .withDockerConfig("/home/ht061/.docker")
                .withApiVersion("1.40")
//                .withRegistryUrl("https://index.docker.io/v1/")
//                .withRegistryUsername("dockeruser")
//                .withRegistryPassword("ilovedocker")
//                .withRegistryEmail("dockeruser@github.com")
                .build();
        DockerClient docker = DockerClientBuilder.getInstance(config).build();
        Version exec = docker.versionCmd().exec();
        System.out.println(exec.toString());
    }
}
