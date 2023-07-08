package com.property.service.impl;

import com.property.dao.PaymentDao;
import com.property.po.Payment;
import com.property.service.PaymentService;
import com.property.vo.PaymentVO2;
import com.property.vo.PaymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-12 0:43
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Override
    public List<PaymentVo> findAll() {
        return paymentDao.findAll();
    }

    @Override
    public List<PaymentVo> findByOwner_id(int owner_id) {
        return paymentDao.findByOwner_id(owner_id);
    }

    @Override
    public List<PaymentVO2> findByPaymenttypeid(int paymenttype_id) {
        return paymentDao.findByPaymenttypeid(paymenttype_id);
    }

    @Override
    public Payment findById(int payment_id) {
        return paymentDao.findById(payment_id);
    }

    @Override
    public boolean addPayment(Payment payment) {
        return paymentDao.addPayment(payment)>0?true:false;
    }

    @Override
    public boolean updatePayment(Payment payment) {
        return paymentDao.updatePayment(payment)>0?true:false;
    }

    @Override
    public boolean deletePayment(int payment_id) {
        return paymentDao.deletePayment(payment_id)>0?true:false;
    }

    @Override
    public List<PaymentVO2> findByPaymenttypeidByVid(int vid, int paymenttype_id) {
        return paymentDao.findByPaymenttypeidByVid(vid,paymenttype_id);
    }
}
