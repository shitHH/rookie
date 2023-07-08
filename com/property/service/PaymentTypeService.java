package com.property.service;

import com.property.po.PaymentType;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-10 16:59
 * 缴费类型业务逻辑接口
 */
public interface PaymentTypeService {
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
     * @return 是否成功
     */
    public boolean addPaymentType(PaymentType paymentType);

    /**
     * 删除缴费类型
     * @param paymenttype_id 缴费类型编号
     * @return 是否成功
     */
    public boolean deletePaymentType(int paymenttype_id);

    /**
     * 更新缴费类型
     * @param paymentType 缴费类型
     * @return 是否成功
     */
    public boolean updatePaymentType(PaymentType paymentType);
}
