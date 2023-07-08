package com.property.service;

import com.property.po.Payment;
import com.property.vo.PaymentVO2;
import com.property.vo.PaymentVo;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-10 17:00
 * 缴费记录业务逻辑接口
 */
public interface PaymentService {
    /**
     * 查询所有的缴费记录
     * @return 缴费记录对象的集合
     */
    public List<PaymentVo> findAll();
    /**
     * 用户编号查询用户缴费记录列表
     * @param owner_id 业主编号
     * @return 缴费记录列表
     */
    public List<PaymentVo> findByOwner_id(int owner_id);

    /**
     * 根据缴费类型编号查询用户缴费记录列表
     * @param paymenttype_id 缴费类型编号
     * @return 缴费记录对象的集合
     */
    public List<PaymentVO2> findByPaymenttypeid(int paymenttype_id);

    /**
     * 根据缴费记录编号查询缴费记录
     * @param payment_id 缴费记录编号
     * @return 缴费记录对象
     */
    public Payment findById(int payment_id);

    /**
     * 添加缴费记录
     * @param payment 缴费记录对象
     * @return 是否成功
     */
    public boolean addPayment(Payment payment);

    /**
     * 更新缴费记录
     * @param payment 缴费记录对象
     * @return 是否成功
     */
    public boolean updatePayment(Payment payment);

    /**
     * 删除缴费记录
     * @param payment_id 缴费记录编号
     * @return 是否成功
     */
    public boolean deletePayment(int payment_id);

    /**
     * 根据缴费类型编号查询用户缴费记录列表
     * @param paymenttype_id 缴费类型编号
     * @return 缴费记录对象的集合
     */
    public List<PaymentVO2> findByPaymenttypeidByVid(int vid,int paymenttype_id);
}
