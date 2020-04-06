package cn.com.citydo.starters.dynamicdatasourcestarterdemo.dao;

import cn.com.citydo.starters.dynamicdatasource.annotation.Master;
import cn.com.citydo.starters.dynamicdatasource.annotation.Slave;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.List;

/**
 * Created by Caorenpeng
 * 2020-04-06
 */
@Repository
public interface MasterAndSlaveMapper {
    /**
     * 表示是从库，会进行轮训算法进行查询
     *
     * @return
     */
    @Slave
    List<Map> getSlave();

    /**
     * 表示是主库
     *
     * @return
     */
    @Master
    int insertUser(@Param("id") String id, @Param("name") String name);
}
