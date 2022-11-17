package com.JpaTraining.JpaTraining.business.objectmapping.manual.concretes;

import com.JpaTraining.JpaTraining.business.objectmapping.manual.abstracts.ManualMapper;
import com.JpaTraining.JpaTraining.business.request.pagerequest.OrderModel;
import com.JpaTraining.JpaTraining.business.request.pagerequest.SortModel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SortMapper implements ManualMapper<SortModel, Sort> {

    private final ManualMapper<OrderModel, Sort.Order> orderMapper;

    @Override
    public Sort map(SortModel sortModel) {
        return sortModel == null || sortModel.getOrders().isEmpty() ?
                Sort.unsorted() :
                Sort.by(orderMapper.mapCollection(sortModel.getOrders()));
    }

}
