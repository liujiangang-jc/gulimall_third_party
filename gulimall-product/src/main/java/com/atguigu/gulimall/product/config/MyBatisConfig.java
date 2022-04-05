package com.atguigu.gulimall.product.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement//开启事务
@MapperScan("com.atguigu.gulimall.product.dao")
public class MyBatisConfig {

    //引入分页插件
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置请求的页数大于最大的操作,true调回到首页,false继续请求
        paginationInterceptor.setOverflow(true);
        //设置最大单页显示数量,默认500条,-1不受限制
        paginationInterceptor.setLimit(1000);
        return paginationInterceptor;
    }

}
