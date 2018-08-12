package com.blj.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * druid连接池配置
 * Created by blj on 2017/10/31.
 */
@Configuration
public class DruidDataSourceConfig {

    private Logger logger = LoggerFactory.getLogger(DruidDataSourceConfig.class);

    @Bean(name = "defaultDruidDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource createDruidDataSource(){
        logger.info("---------德鲁伊数据源开始设置监控--------");
        DruidDataSource druidDataSource = new DruidDataSource();
        logger.info("---------德鲁伊数据源配置成功--------");
        return druidDataSource;
    }
}
