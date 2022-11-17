package com.JpaTraining.JpaTraining.business.objectmapping.abstraction;

public interface ReversibleMapper<Source, Destination> extends Mapper<Source, Destination> {

    Source mapReverse(Destination destination);

}
