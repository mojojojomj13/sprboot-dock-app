package com.prit.docker.dockerspringboot.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@WebMvcTest(MyController.class)
@Slf4j
@AutoConfigureMockMvc(secure = false)
public class MyControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void testHello() throws Exception {
		log.info("Testing sayHello from controller....");
		mvc.perform(get("/hello/Prithvish")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hi Prithvish")));
	}
}
