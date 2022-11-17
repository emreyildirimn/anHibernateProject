package com.JpaTraining.JpaTraining.business.request.pagerequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestModel {

    @Min(value = 0)
    private Integer pageNo = 0;

    @Min(value = 1)
    @Max(value = 100)
    private Integer pageSize = 10;

    @Valid
    private SortModel sort;

}
