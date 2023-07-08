package com.property.dao;

import com.property.po.PaymentType;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-10 16:31
 * 缴费类型数据访问接口
 */
public interface PaymentTypeDao {

    /**
     * 查询所有的缴费类型
     * @return 缴费类型对象的集合
     */
    public List<PaymentType> findAll();

    /**
     * 根据编号查询缴费类型
     * @param paymenttype_id 缴费类型编号
     * @return 缴费类型
     */
    public PaymentType findById(int paymenttype_id);

    /**
     * 添加缴费类型
     * @param paymentType 缴费类型
     * @return 受影响的行数
     */
    public int addPaymentType(PaymentType paymentType);

    /**
     * 删除缴费类型
     * @param paymenttype_id 缴费类型编号
     * @return 受影响的行数
     */
    public int deletePaymentType(int paymenttype_id);

    /**
     * 更新缴费类型
     * @param paymentType 缴费类型
     * @return 受影响的行数
     */
    public int updatePaymentType(PaymentType paymentType);
}
