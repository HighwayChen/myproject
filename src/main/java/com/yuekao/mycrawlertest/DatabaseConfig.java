package com.yuekao.mycrawlertest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wanglei on 2016/2/29.
 */
@Configuration
@MapperScan(basePackages = {"com.yuekao.*.db.mapper"})
public class DatabaseConfig {
}
