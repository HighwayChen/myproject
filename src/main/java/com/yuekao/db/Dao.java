/**
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 */
package com.yuekao.db;

import java.lang.annotation.*;

/**
 * 用在Mybatis的Dao上面，更方便Scanner去识别
 * Date: 2018-03-23
 *
 * @author wanglei
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Dao {
}
