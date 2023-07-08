package com.property.vo;

/**
 * @Author : bugger
 * @create 2022/9/15 12:08
 */
public class ComplaintNum {
    private int complaintNum;

    public ComplaintNum() {
    }

    public ComplaintNum(int complaintNum) {
        this.complaintNum = complaintNum;
    }

    public int getComplaintNum() {
        return complaintNum;
    }

    public void setComplaintNum(int complaintNum) {
        this.complaintNum = complaintNum;
    }

    @Override
    public String toString() {
        return "ComplaintNum{" +
                "complaintNum=" + complaintNum +
                '}';
    }
}
