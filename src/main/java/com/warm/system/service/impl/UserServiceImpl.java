package com.warm.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.warm.common.DBTypeEnum;
import com.warm.common.DataSourceSwitch;
import com.warm.system.entity.User;
import com.warm.system.mapper.OrderMapper;
import com.warm.system.mapper.UserMapper;
import com.warm.system.service.db1.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dgd123
 * @since 2018-02-10
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.selectAll();
    }

    @DataSourceSwitch(DBTypeEnum.db2)
    @Override
    public BigDecimal getOrderPriceByUserId(Integer userId) {
        return orderMapper.selectByPrimaryKey(userId).getPrice();
    }
}
