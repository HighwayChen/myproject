/**
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 */
package com.yuekao.db;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * 关系数据库数据源配置
 * Date: 2018-03-23
 *
 * @author wanglei
 */
@Configuration
@EnableConfigurationProperties(DataSourceSettings.class)
public class DataSourceAutoConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(DataSourceAutoConfiguration.class);

    @Autowired
    DataSourceSettings settings;

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(ApplicationContext applicationContext) throws IOException {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(settings);
        sqlSessionFactory.setMapperLocations(applicationContext.getResources(settings.getMapperLocations()));
        return sqlSessionFactory;
    }
}
