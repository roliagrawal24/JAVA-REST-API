package spring.dao;



	
	
	 
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

import org.springframework.stereotype.Repository;

import spring.model.Employee1;
	 
	@Repository
	public class employee {
	
	    private static final Map<String, Employee1> empMap = new HashMap<String, Employee1>();
	 
	    static {
	        initEmps();
	    }
	 
	    private static void initEmps() {
	        Employee1 emp1 = new Employee1("E01", "Smith", "Clerk");
	        Employee1 emp2 = new Employee1("E02", "Allen", "Salesman");
	        Employee1 emp3 = new Employee1("E03", "Jones", "Manager");
	 
	        empMap.put(emp1.getEmpNo(), emp1);
	        empMap.put(emp2.getEmpNo(), emp2);
	        empMap.put(emp3.getEmpNo(), emp3);
	    }
	 
	    public Employee1 getEmployee(String empNo) {
	        return empMap.get(empNo);
	    }
	 
	    public Employee1 addEmployee(Employee1 emp) {
	        empMap.put(emp.getEmpNo(), emp);
	        return emp;
	    }
	 
	    public Employee1 updateEmployee(Employee1 emp) {
	        empMap.put(emp.getEmpNo(), emp);
	        return emp;
	    }
	 
	    public void deleteEmployee(String empNo) {
	        empMap.remove(empNo);
	    }
	 
	    public List<Employee1> getAllEmployees() {
	        Collection<Employee1> c = empMap.values();
	        List<Employee1> list = new ArrayList<Employee1>();
	        list.addAll(c);
	        return list;
	    }
	 
	}

