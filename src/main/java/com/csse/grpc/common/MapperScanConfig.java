package com.csse.grpc.common;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanggt
 * @company csse
 * @date 2020/4/23
 */
@Configuration
@MapperScan("com.csse.grpc.dao")
public class MapperScanConfig {

    /**
     * 分页插件
     * @return page
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType(DbType.DM.name());
        return page;
    }
}
