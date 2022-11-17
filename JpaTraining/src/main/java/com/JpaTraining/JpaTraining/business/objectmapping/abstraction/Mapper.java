package com.JpaTraining.JpaTraining.business.objectmapping.abstraction;

public interface Mapper<Source, Destination> {

    Destination map(Source source);

}
