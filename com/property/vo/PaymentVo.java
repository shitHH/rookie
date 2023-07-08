package com.property.vo;

import java.sql.Timestamp;

/**
 * author: Eeerosss
 * date: 2022/9/12 16:32
 * 缴费记录实体类vo
 */
public class PaymentVo {
    /**
     * 缴费编号
     */
    private int payment_id;

    /**
     * 缴费类型编号
     */
    private int paymenttype_id;

    /**
     * 业主编号
     */
    private int owner_id;

    /**
     * 缴纳月份
     */
    private String payment_mon;

    /**
     * 缴纳金额
     */
    private String payment_price;

    /**
     * 缴纳总金额
     */
    private String payment_sum;

    /**
     * 缴费时间
     */
    private Timestamp payment_ctime;

    /**
     * 缴费类型名称
     */
    private String paymenttype_name;

    @Override
    public String toString() {
        return "PaymentVo{" +
                "payment_id=" + payment_id +
                ", paymenttype_id=" + paymenttype_id +
                ", owner_id=" + owner_id +
                ", payment_mon='" + payment_mon + '\'' +
                ", payment_price='" + payment_price + '\'' +
                ", payment_sum='" + payment_sum + '\'' +
                ", payment_ctime=" + payment_ctime +
                ", paymenttype_name='" + paymenttype_name + '\'' +
                '}';
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getPaymenttype_id() {
        return paymenttype_id;
    }

    public void setPaymenttype_id(int paymenttype_id) {
        this.paymenttype_id = paymenttype_id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getPayment_mon() {
        return payment_mon;
    }

    public void setPayment_mon(String payment_mon) {
        this.payment_mon = payment_mon;
    }

    public String getPayment_price() {
        return payment_price;
    }

    public void setPayment_price(String payment_price) {
        this.payment_price = payment_price;
    }

    public String getPayment_sum() {
        return payment_sum;
    }

    public void setPayment_sum(String payment_sum) {
        this.payment_sum = payment_sum;
    }

    public Timestamp getPayment_ctime() {
        return payment_ctime;
    }

    public void setPayment_ctime(Timestamp payment_ctime) {
        this.payment_ctime = payment_ctime;
    }

    public String getPaymenttype_name() {
        return paymenttype_name;
    }

    public void setPaymenttype_name(String paymenttype_name) {
        this.paymenttype_name = paymenttype_name;
    }

    public PaymentVo() {
    }

    public PaymentVo(int payment_id, int paymenttype_id, int owner_id, String payment_mon, String payment_price, String payment_sum, Timestamp payment_ctime, String paymenttype_name) {
        this.payment_id = payment_id;
        this.paymenttype_id = paymenttype_id;
        this.owner_id = owner_id;
        this.payment_mon = payment_mon;
        this.payment_price = payment_price;
        this.payment_sum = payment_sum;
        this.payment_ctime = payment_ctime;
        this.paymenttype_name = paymenttype_name;
    }
}
