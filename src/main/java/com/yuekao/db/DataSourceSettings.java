/**
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 */
package com.yuekao.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Class for configuration of a data source.
 * More settings please check the set methods in super class.
 * Date: 2018-03-23
 *
 * @author wanglei
 */
@ConfigurationProperties(prefix = DataSourceSettings.PREFIX)
public class DataSourceSettings extends DruidDataSource {

    public static final String PREFIX = "druid.datasource";

    private String mapperLocations;

    public String getMapperLocations() {
        return mapperLocations;
    }

    public void setMapperLocations(String mapperLocations) {
        this.mapperLocations = mapperLocations;
    }
}
