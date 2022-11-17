package com.JpaTraining.JpaTraining.business.request.pagerequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SortModel {

    private List<@Valid OrderModel> orders;

}
