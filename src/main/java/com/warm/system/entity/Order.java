package com.warm.system.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author dgd123
 * @since 2018-02-10
 */
@Data
@Table(name="t_order") //extends Model<Order>
public class Order implements Serializable{

    private static final long serialVersionUID = -5809829878372943999L;

//    @TableId(value = "id", type = IdType.AUTO)
    @Id
    private Integer id;
    /**
     * 订单号
     */
//    @TableField("order_no")
    private String orderNo;
    /**
     * 用户ID
     */
//    @TableField("user_id")
    private Integer userId;
    /**
     * 支付金额
     */
    private BigDecimal price;
    /**
     * 支付时间
     */
//    @TableField("paid_time")
    private Date paidTime;
    /**
     * 创建时间
     */
//    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
//    @TableField("modify_time")
    private Date modifyTime;

    /*@Override
    protected Serializable pkVal() {
        return this.id;
    }*/
}
