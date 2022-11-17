package com.JpaTraining.JpaTraining.business.objectmapping.manual.concretes;

import com.JpaTraining.JpaTraining.business.objectmapping.manual.abstracts.ManualMapper;
import com.JpaTraining.JpaTraining.business.request.pagerequest.PageRequestModel;
import com.JpaTraining.JpaTraining.business.request.pagerequest.SortModel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PageRequestMapper implements ManualMapper<PageRequestModel, PageRequest> {

    private final ManualMapper<SortModel, Sort> sortMapper;

    @Override
    public PageRequest map(PageRequestModel pageRequestModel) {
        return PageRequest.of(pageRequestModel.getPageNo(), pageRequestModel.getPageSize(), sortMapper.map(pageRequestModel.getSort()));
    }

}
