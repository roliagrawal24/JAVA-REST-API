package spring.controller;


	
	 
	import java.util.List;
	 
	import spring.dao.employee;
	import spring.model.Employee1;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.MediaType;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RestController;
	 
	@RestController
	public class MvcRestController {
	 
	    @Autowired
	    private employee employeeDAO;
	 
	    @RequestMapping("/")
	    @ResponseBody
	    public String welcome() {
	        return "Welcome to RestTemplate Example.";
	    }
	 
	    // URL:
	    // http://localhost:8080/SpringMVCRESTful/employees
	    // http://localhost:8080/SpringMVCRESTful/employees.xml
	    // http://localhost:8080/SpringMVCRESTful/employees.json
	    @RequestMapping(value = "/employees", //
	            method = RequestMethod.GET, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public List<Employee1> getEmployees() {
	        List<Employee1> list = employeeDAO.getAllEmployees();
	        return list;
	    }
	 
	    // URL:
	    // http://localhost:8080/SpringMVCRESTful/employee/{empNo}
	    // http://localhost:8080/SpringMVCRESTful/employee/{empNo}.xml
	    // http://localhost:8080/SpringMVCRESTful/employee/{empNo}.json
	    @RequestMapping(value = "/employee/{empNo}", //
	            method = RequestMethod.GET, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Employee1 getEmployee(@PathVariable("empNo") String empNo) {
	        return employeeDAO.getEmployee(empNo);
	    }
	 
	    // URL:
	    // http://localhost:8080/SpringMVCRESTful/employee
	    // http://localhost:8080/SpringMVCRESTful/employee.xml
	    // http://localhost:8080/SpringMVCRESTful/employee.json
	    @RequestMapping(value = "/employee", //
	            method = RequestMethod.POST, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Employee1 addEmployee(@RequestBody Employee1 emp) {
	 
	        return employeeDAO.addEmployee(emp);
	 
	    }
	 
	    // URL:
	    // http://localhost:8080/SpringMVCRESTful/employee
	    // http://localhost:8080/SpringMVCRESTful/employee.xml
	    // http://localhost:8080/SpringMVCRESTful/employee.json
	    @RequestMapping(value = "/employee", //
	            method = RequestMethod.PUT, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public Employee1 updateEmployee(@RequestBody Employee1 emp) {
	 
	        return employeeDAO.updateEmployee(emp);
	    }
	 
	    // URL:
	    // http://localhost:8080/SpringMVCRESTful/employee/{empNo}
	    @RequestMapping(value = "/employees/{empNo}", //
	            method = RequestMethod.DELETE, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public void deleteEmployee(@PathVariable("empNo") String empNo) {
	        employeeDAO.deleteEmployee(empNo);
	    }
	 
	}

