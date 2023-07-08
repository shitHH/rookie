package com.property.po;

import java.sql.Timestamp;

/**
 * @Author : bugger
 * @create 2022/9/9 15:57
 * 缴费记录实体类
 */
public class Payment {

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
     * 缴纳总月份
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

    public Payment() {
    }

    public Payment(int paymenttype_id, int owner_id, int payment_mon, double payment_price, double payment_sum, Timestamp payment_ctime) {
        this.paymenttype_id = paymenttype_id;
        this.owner_id = owner_id;
        this.payment_mon = payment_mon;
        this.payment_price = payment_price;
        this.payment_sum = payment_sum;
        this.payment_ctime = payment_ctime;
    }

    public Payment(int payment_id, int paymenttype_id, int owner_id, int payment_mon, double payment_price, double payment_sum, Timestamp payment_ctime) {
        this.payment_id = payment_id;
        this.paymenttype_id = paymenttype_id;
        this.owner_id = owner_id;
        this.payment_mon = payment_mon;
        this.payment_price = payment_price;
        this.payment_sum = payment_sum;
        this.payment_ctime = payment_ctime;
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

    @Override
    public String toString() {
        return "Payment{" +
                "payment_id=" + payment_id +
                ", paymenttype_id=" + paymenttype_id +
                ", owner_id=" + owner_id +
                ", payment_mon='" + payment_mon + '\'' +
                ", payment_price='" + payment_price + '\'' +
                ", payment_sum='" + payment_sum + '\'' +
                ", payment_ctime=" + payment_ctime +
                '}';
    }
}
