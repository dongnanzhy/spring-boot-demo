package com.springlearner.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")   // 这个是整个类的url
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProperties;

    //下面是函数的url，使用时把类url和函数url拼起来
    //value值是一个集合，例如value = {"/say",  "/hi"}
    //不指定method，GET,POST都可以用，但这种做法不推荐
//    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
//    public String say(@PathVariable("id") Integer id) {
//        return "id: " + id;
//        //return girlProperties.getCupSize();
//    }

//    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @GetMapping(value = "/say")   // 组合注解
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myid) {
        return "id: " + myid;
    }
}
