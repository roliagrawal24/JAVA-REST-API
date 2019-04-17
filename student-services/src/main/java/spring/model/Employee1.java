package spring.model;

public class Employee1 {
	
	 
	    private String empNo;
	    private String empName;
	    private String position;
	 
	    // This default constructor is required if there are other constructors.
	    public Employee1() {
	  
	    }
	 
	    public Employee1(String empNo, String empName, String position) {
	        this.empNo = empNo;
	        this.empName = empName;
	        this.position = position;
	    }
	 
	    public String getEmpNo() {
	        return empNo;
	    }
	 
	    public void setEmpNo(String empNo) {
	        this.empNo = empNo;
	    }
	 
	    public String getEmpName() {
	        return empName;
	    }
	 
	    public void setEmpName(String empName) {
	        this.empName = empName;
	    }
	 
	    public String getPosition() {
	        return position;
	    }
	 
	    public void setPosition(String position) {
	        this.position = position;
	    }
	 
	}

