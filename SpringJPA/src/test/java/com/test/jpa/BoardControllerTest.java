package com.test.jpa;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by JuHyun on 2015. 6. 3..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = SpringJpaApplication.class)
public class BoardControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;

    @Before
    public void setup() {
        this.mvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        BoardDao boardDao = wac.getBean(BoardDao.class);
        boardDao.save(new Board("title1","content1"));
        boardDao.save(new Board("title2","content2"));
        boardDao.save(new Board("title3","content3"));
        boardDao.save(new Board("title4","content4"));
        boardDao.save(new Board("title5","content5"));
    }

    @Test
    public void testListAll() throws Exception {
        MvcResult result =  mvc.perform(MockMvcRequestBuilders.get("/list")
                .accept(MediaType.APPLICATION_JSON))
                .andReturn();
    }

    @Test
    public void testIndex() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.ALL));
    }
}



