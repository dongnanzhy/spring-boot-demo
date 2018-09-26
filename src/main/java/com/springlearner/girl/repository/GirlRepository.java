package com.springlearner.girl.repository;

import com.springlearner.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //通过年龄查询， 要严格按照这个格式命名才能运行
    public List<Girl> findByAge(Integer age);
}
