package com.odx.test.repository;

import com.odx.test.domain.Demo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PalindromeRepository extends CrudRepository<Demo, Long> {

    List<Demo> findByName(String name);
    List<Demo> findAll();

}
