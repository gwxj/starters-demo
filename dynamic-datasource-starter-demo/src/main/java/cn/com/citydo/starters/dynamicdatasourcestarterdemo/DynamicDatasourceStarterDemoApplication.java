package cn.com.citydo.starters.dynamicdatasourcestarterdemo;

import cn.com.citydo.starters.dynamicdatasource.annotation.EnableDynamicDataSource;
import cn.com.citydo.starters.dynamicdatasource.annotation.EnableReadAndWrite;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//实现动态数据源 引入该注解即可
@EnableDynamicDataSource
//要实现读写分离，需要再加一个这样的注解
@EnableReadAndWrite(master = {"master"}, slave = {"slave"})
public class DynamicDatasourceStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceStarterDemoApplication.class, args);
    }

}
