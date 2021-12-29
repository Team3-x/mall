package com.tim.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合Mybatis-plus
 * 1.导入依赖
 * 2.配置
 *   1.配置数据源
 *      1.导入数据路驱动
 *      2.在application.yml配置数据源相关信息
 *   2.配置Mybatis-plus
 *      1.使用@MapperScan
 *      2.sql映射文件的位置
 */
@MapperScan("com.tim.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
