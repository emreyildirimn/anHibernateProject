package com.JpaTraining.JpaTraining.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface JpaRepositoryAdapter<T, ID> extends JpaRepository<T, ID> {

    <P> List<P> findAllBy(Class<P> projection);

}
