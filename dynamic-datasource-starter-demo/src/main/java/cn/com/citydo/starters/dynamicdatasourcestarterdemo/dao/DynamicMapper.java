package cn.com.citydo.starters.dynamicdatasourcestarterdemo.dao;

import cn.com.citydo.starters.dynamicdatasource.annotation.DS;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.List;

/**
 * Created by Caorenpeng
 * 2020-04-06
 */
@Repository
public interface DynamicMapper {
    /**
     * 查询用户库
     *
     * @return
     */
    @DS("user")
    List<Map> getUser();

    /**
     * 查询订单库
     *
     * @return
     */
    @DS("order")
    List<Map> getOrder();
}
