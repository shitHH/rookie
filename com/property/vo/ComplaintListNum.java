package com.property.vo;

/**
 * @Author : bugger
 * @create 2022/9/15 12:09
 */
public class ComplaintListNum {
    private int complaintListNum;

    public ComplaintListNum() {
    }

    public ComplaintListNum(int complaintListNum) {
        this.complaintListNum = complaintListNum;
    }

    public int getComplaintListNum() {
        return complaintListNum;
    }

    public void setComplaintListNum(int complaintListNum) {
        this.complaintListNum = complaintListNum;
    }

    @Override
    public String toString() {
        return "ComplaintListNum{" +
                "complaintListNum=" + complaintListNum +
                '}';
    }
}
