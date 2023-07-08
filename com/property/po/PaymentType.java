package com.property.po;

/**
 * @Author : bugger
 * @create 2022/9/9 15:50
 * 缴费类型实体类
 */
public class PaymentType {

    /**
     * 缴费类型编号
     */
    private int paymenttype_id;

    /**
     * 缴费类型名称
     */
    private String paymenttype_name;

    public PaymentType() {
    }

    public PaymentType(String paymenttype_name) {
        this.paymenttype_name = paymenttype_name;
    }

    public PaymentType(int paymenttype_id, String paymenttype_name) {
        this.paymenttype_id = paymenttype_id;
        this.paymenttype_name = paymenttype_name;
    }

    public int getpaymenttype_id() {
        return paymenttype_id;
    }

    public void setpaymenttype_id(int paymenttype_id) {
        this.paymenttype_id = paymenttype_id;
    }

    public String getpaymenttype_name() {
        return paymenttype_name;
    }

    public void setpaymenttype_name(String paymenttype_name) {
        this.paymenttype_name = paymenttype_name;
    }

    @Override
    public String toString() {
        return "PaymentType{" +
                "paymenttype_id=" + paymenttype_id +
                ", paymenttype_name='" + paymenttype_name + '\'' +
                '}';
    }
}
