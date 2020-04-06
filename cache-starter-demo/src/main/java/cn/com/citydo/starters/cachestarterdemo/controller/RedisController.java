package cn.com.citydo.starters.cachestarterdemo.controller;

import cn.com.citydo.starters.cache.template.RedissonTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Caorenpeng
 * 2020-04-06
 */
@RestController
public class RedisController {
    @Autowired
    private RedissonTemplate template;

    /**
     * 分布式锁
     *
     * @return
     */
    @GetMapping(value = "/get")
    public String get() {
        template.lock("lockKey", 30);

        System.out.println("执行业务流程");

        template.unlock("lockKey");
        return "success";
    }
}
