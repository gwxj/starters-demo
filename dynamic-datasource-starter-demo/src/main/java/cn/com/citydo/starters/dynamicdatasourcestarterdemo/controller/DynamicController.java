package cn.com.citydo.starters.dynamicdatasourcestarterdemo.controller;

import cn.com.citydo.starters.dynamicdatasource.holder.DataSourceHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Caorenpeng
 * 2020-04-06
 */
@RestController
public class DynamicController {
    /**
     * 手动切换数据库
     *
     * @return
     */
    @GetMapping(value = "/hello")
    public String hello() {
        DataSourceHolder.set("master");
        System.out.println("执行业务逻辑");
        DataSourceHolder.remove();
        return "success";
    }
}
