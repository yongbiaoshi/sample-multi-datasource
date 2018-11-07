package com.my.sample.multidatasource.config;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusProperties;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier("primaryMybatisPlusProperties")
    @ConfigurationProperties(prefix = "mybatis-plus.primary")
    public MybatisPlusProperties primaryMybatisPlusProperties() {
        return new MybatisPlusProperties();
    }

    @Bean
    @Qualifier("secondaryMybatisPlusProperties")
    @ConfigurationProperties(prefix = "mybatis-plus.secondary")
    public MybatisPlusProperties secondaryMybatisPlusProperties() {
        return new MybatisPlusProperties();
    }

}
