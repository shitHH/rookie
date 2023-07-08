package com.property.service.impl;

import com.property.dao.PaymentTypeDao;
import com.property.po.PaymentType;
import com.property.service.PaymentTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-12 0:39
 */
public class PaymentTypeServiceImpl implements PaymentTypeService {

    @Autowired
    PaymentTypeDao paymentTypeDao;

    @Override
    public List<PaymentType> findAll() {
        return paymentTypeDao.findAll();
    }

    @Override
    public PaymentType findById(int paymenttype_id) {
        return paymentTypeDao.findById(paymenttype_id);
    }

    @Override
    public boolean addPaymentType(PaymentType paymentType) {
        return paymentTypeDao.addPaymentType(paymentType)>0?true:false;
    }

    @Override
    public boolean deletePaymentType(int paymenttype_id) {
        return paymentTypeDao.deletePaymentType(paymenttype_id)>0?true:false;
    }

    @Override
    public boolean updatePaymentType(PaymentType paymentType) {
        return paymentTypeDao.updatePaymentType(paymentType)>0?true:false;
    }
}
