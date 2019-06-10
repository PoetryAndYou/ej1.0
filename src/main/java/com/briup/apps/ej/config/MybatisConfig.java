package com.briup.apps.ej.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.briup.apps.app02.dao")
public class MybatisConfig {

}
