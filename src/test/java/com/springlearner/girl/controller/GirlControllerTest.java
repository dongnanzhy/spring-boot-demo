package com.springlearner.girl.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GirlControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void girlList() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/girls"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("[{\"id\":1,\"cupSize\":\"A\",\"age\":18},{\"id\":2,\"cupSize\":\"B\",\"age\":20},{\"id\":3,\"cupSize\":\"E\",\"age\":25},{\"id\":4,\"cupSize\":\"A\",\"age\":18},{\"id\":5,\"cupSize\":\"B\",\"age\":19},{\"id\":6,\"cupSize\":\"B\",\"age\":20},{\"id\":7,\"cupSize\":\"B\",\"age\":32}]"));
    }
}