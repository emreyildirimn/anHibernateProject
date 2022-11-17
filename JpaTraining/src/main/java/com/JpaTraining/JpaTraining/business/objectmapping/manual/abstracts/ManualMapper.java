package com.JpaTraining.JpaTraining.business.objectmapping.manual.abstracts;

import com.JpaTraining.JpaTraining.business.objectmapping.abstraction.CollectionMapper;
import com.JpaTraining.JpaTraining.business.objectmapping.abstraction.Mapper;

public interface ManualMapper<Source, Destination> extends Mapper<Source, Destination>, CollectionMapper<Source, Destination> {
}
