package com.JpaTraining.JpaTraining.business.objectmapping.manual.concretes;

import com.JpaTraining.JpaTraining.business.objectmapping.manual.abstracts.ManualMapper;
import com.JpaTraining.JpaTraining.business.request.pagerequest.OrderModel;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper implements ManualMapper<OrderModel, Sort.Order> {

    @Override
    public Sort.Order map(OrderModel orderModel) {
        return orderModel.isIgnoreCase() ?
                new Sort.Order(orderModel.getDirection(), orderModel.getProperty(), orderModel.getNullHandling()).ignoreCase() :
                new Sort.Order(orderModel.getDirection(), orderModel.getProperty(), orderModel.getNullHandling());
    }

}
