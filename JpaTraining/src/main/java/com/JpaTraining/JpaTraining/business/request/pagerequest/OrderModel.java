package com.JpaTraining.JpaTraining.business.request.pagerequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Sort;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {

    @NotBlank
    private String property;

    private Sort.Direction direction = Sort.Direction.ASC;

    private Sort.NullHandling nullHandling = Sort.NullHandling.NULLS_LAST;

    private boolean ignoreCase = false;

}
