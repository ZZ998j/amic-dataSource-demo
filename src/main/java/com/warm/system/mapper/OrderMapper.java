package com.warm.system.mapper;

import com.warm.system.entity.Order;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dgd123
 * @since 2018-02-10
 */
public interface OrderMapper extends Mapper<Order> {
//    @Select("SELECT price from t_order where user_id =#{userId}")
//    BigDecimal getPriceByUserId(Integer userId);
    List<Order> selectAlltb();
}
