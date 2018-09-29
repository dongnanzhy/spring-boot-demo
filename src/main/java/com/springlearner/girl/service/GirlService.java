package com.springlearner.girl.service;

import com.springlearner.girl.domain.Girl;
import com.springlearner.girl.enums.ResultEnum;
import com.springlearner.girl.exception.GirlException;
import com.springlearner.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional     //注解的意思是任何一个失败则都不插入
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception {
        Optional<Girl> girl = girlRepository.findById(id);
        Integer age = girl.get().getAge();
        if (age < 22) {
            throw new GirlException(ResultEnum.COLLEDGE);
        } else if (age > 22 && age < 28) {
            throw new GirlException(ResultEnum.NEW_TO_WORK);
        }
    }
}
