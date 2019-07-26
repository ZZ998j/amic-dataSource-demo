package com.warm.system.service.impl;

import com.warm.common.DBTypeEnum;
import com.warm.common.DataSourceSwitch;
import com.warm.system.entity.Order;
import com.warm.system.mapper.OrderMapper;
import com.warm.system.service.db2.OrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dgd123
 * @since 2018-02-10
 */
@Service
public class OrderServiceImpl  implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrderList() {
        return orderMapper.selectAlltb();
    }

    @DataSourceSwitch(DBTypeEnum.db1)
    @Override
    public BigDecimal getOrderPriceByUserId(Integer userId) {
        return orderMapper.selectByPrimaryKey(userId).getPrice();
    }
}
