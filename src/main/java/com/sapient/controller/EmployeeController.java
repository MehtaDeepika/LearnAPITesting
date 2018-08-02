package com.sapient.controller;

import com.sapient.service.ServiceEmployee;
import com.sapient.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;

@RestController
public class EmployeeController {
    private static final String template = "Hello, %s!";

    @Autowired
    ServiceEmployee servEmpl;

    //Get an Employee for a particular ID
    @RequestMapping(method = RequestMethod.GET,path="/employee/{id}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployee(@RequestParam(value="id") Long l){
       return servEmpl.getEmployeeDetails(l);
    }

    //Get All available Employees
    @RequestMapping(method = RequestMethod.GET,path="/employee")
    public List<Employee> getAllEmployee(){
        return servEmpl.getAllEmployeeDetails();
    }

    //Get All available Employees
    @RequestMapping(method = RequestMethod.POST,path="/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity createEmployee(@RequestBody Employee emp){
        servEmpl.addEmployeeDetails(emp);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT,path="/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void updateEmployee(@RequestBody Employee emp){
        servEmpl.updateEmployeeDetails(emp);
    }

    @RequestMapping(method = RequestMethod.DELETE,path="/employee/{id}")
    public void deleteEmployee(@RequestParam(value="id") Long l){
        servEmpl.deleteEmployee(l);
    }
}
