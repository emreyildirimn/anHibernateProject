package com.JpaTraining.JpaTraining.business.objectmapping.mapstruct;

import com.JpaTraining.JpaTraining.business.objectmapping.abstraction.CollectionMapper;
import com.JpaTraining.JpaTraining.business.objectmapping.abstraction.ReversibleMapper;

public interface MapStructMapper<Source, Destination> extends ReversibleMapper<Source, Destination>, CollectionMapper<Source, Destination> {
}
