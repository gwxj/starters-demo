package cn.com.citydo.starters.cachestarterdemo;

import cn.com.citydo.starters.cache.annotations.EnableRedisUtil;
import cn.com.citydo.starters.cache.enums.RedisModelEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//代表单机模式
@EnableRedisUtil(cluster = RedisModelEnum.STANDALONE)
public class CacheStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheStarterDemoApplication.class, args);
    }

}
