package com.optus;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@RunWith(value=SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:ListEmployees-servlet.xml")

public class EmployeeControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	@Test
	public void testGetAllEmployees() throws Exception {
		MvcResult result= this.mockMvc.perform(get("/employees")).andReturn();
		ModelAndView modelView =result.getModelAndView();
		ArrayList<Employee> data =(ArrayList<Employee>)modelView.getModel().get("list");
	}
	@Test
	public void testGetEmployeeData() throws Exception {
		MvcResult resul= this.mockMvc.perform(get("/employees/2333")).andReturn();
		ModelAndView modelView =resul.getModelAndView();
		Employee emp =(Employee)modelView.getModel().get("idlist");
		assertEquals(emp.getDept(),"Portal");
	}
}

