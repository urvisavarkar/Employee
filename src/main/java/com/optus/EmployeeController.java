package com.optus;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController{
    @RequestMapping(value="/employees",method = RequestMethod.GET)
	public ModelAndView getAllEmployees() throws Exception{
		Employee e1=new Employee();
		ArrayList<Employee> elist=e1.setValues();
		return new ModelAndView("employee","list",elist);
	}


@RequestMapping(value="/employees/{id}",method = RequestMethod.GET)
public ModelAndView EmpDetails(@PathVariable int id) throws Exception
{	
	 Employee e1=new Employee();
    ArrayList<Employee> all=e1.setValues();
   
    for(Employee e:all)
        if (e.getEid() == id)
            return new ModelAndView("employee_details", "idlist", e);
    return null;
}

}