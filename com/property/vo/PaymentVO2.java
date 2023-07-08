package com.property.vo;

import java.sql.Timestamp;

/**
 * @Author : bugger
 * @create 2022/9/14 12:09
 * 缴费记录视图类
 */
public class PaymentVO2 {
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
     * 缴纳几个月份
     */
    private int payment_mon;

    /**
     * 缴纳金额
     */
    private double payment_price;

    /**
     * 缴纳总金额
     */
    private double payment_sum;

    /**
     * 缴费时间
     */
    private Timestamp payment_ctime;

    /**
     * 缴费类型名称
     */
    private String paymenttype_name;

    /**
     * 业主姓名
     */
    private String owner_name;

    public PaymentVO2() {
    }

    public PaymentVO2(int payment_id, int paymenttype_id, int owner_id, int payment_mon, double payment_price, double payment_sum, Timestamp payment_ctime, String paymenttype_name, String owner_name) {
        this.payment_id = payment_id;
        this.paymenttype_id = paymenttype_id;
        this.owner_id = owner_id;
        this.payment_mon = payment_mon;
        this.payment_price = payment_price;
        this.payment_sum = payment_sum;
        this.payment_ctime = payment_ctime;
        this.paymenttype_name = paymenttype_name;
        this.owner_name = owner_name;
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

    public int getPayment_mon() {
        return payment_mon;
    }

    public void setPayment_mon(int payment_mon) {
        this.payment_mon = payment_mon;
    }

    public double getPayment_price() {
        return payment_price;
    }

    public void setPayment_price(double payment_price) {
        this.payment_price = payment_price;
    }

    public double getPayment_sum() {
        return payment_sum;
    }

    public void setPayment_sum(double payment_sum) {
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

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    @Override
    public String toString() {
        return "PaymentVO2{" +
                "payment_id=" + payment_id +
                ", paymenttype_id=" + paymenttype_id +
                ", owner_id=" + owner_id +
                ", payment_mon=" + payment_mon +
                ", payment_price=" + payment_price +
                ", payment_sum=" + payment_sum +
                ", payment_ctime=" + payment_ctime +
                ", paymenttype_name='" + paymenttype_name + '\'' +
                ", owner_name='" + owner_name + '\'' +
                '}';
    }
}
