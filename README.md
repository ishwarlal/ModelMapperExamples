# ModelMapperExamples
ModelMapper Examples


    public class Employee {

	private Integer employeeId;
	private String email;
	private String phone;
	private String name;
	private Set<EmployeeAddress> addresses;
	private Department department;
  
     --- Getter -- Setter 
    }

    public class EmployeeDTO {

	private Integer employeeId;
	private String employeeName;
	private String email;
	private String mobilePhone;
	private String cellPhone;
	private String nickName;
	private String age;
	private Set<EmployeeAddressDTO> addresses;
	private DepartmentDTO department;
  
     --- Getter -- Setter 
    }


Output Of ModelMapper Startegies Example

(Run ModelMapper.strategies.StartegiesMainExample.java)

################## Loose Startegy ##################

Code:

    Employee e = Util.getDefaultEmployeeData();
    EmployeeDTO e2 = new EmployeeDTO();

    ModelMapper mapper = new ModelMapper();
    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
    mapper.map(e, e2);

-----Actual Employee---

Employee [employeeId=1, name=ABC, email=test@yahoo.com, phone=12342134, addresses=[EmployeeAddress [employeeId=1, address=STREET 1, country=HOME Country, city=HOME City, addressType=Home], EmployeeAddress [employeeId=1, address=STREET 2, country=OFFICE Country, city=OFFICE City, addressType=OFFICE]], department=Department [departmentId=1, name=Software Development, description=Software Development]]

-----Mapped Employee---

EmployeeDTO [employeeId=1, employeeName=ABC, email=test@yahoo.com, mobilePhone=12342134, cellPhone=12342134, nickName=ABC, age=null, addresses=[EmployeeAddress [employeeId=1, employeeAddress=STREET 1, country=HOME Country, city=HOME City, addressType=Home], EmployeeAddress [employeeId=1, employeeAddress=STREET 2, country=OFFICE Country, city=OFFICE City, addressType=OFFICE]], department=Department [departmentId=1, departmentName=Software Development, description=Software Development]]




################## Standard Startegy ##################

Code:

    Employee e = Util.getDefaultEmployeeData();
    EmployeeDTO e2 = new EmployeeDTO();

    ModelMapper mapper = new ModelMapper();
    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
    mapper.map(e, e2);
    

-----Actual Employee---

Employee [employeeId=1, name=ABC, email=test@yahoo.com, phone=12342134, addresses=[EmployeeAddress [employeeId=1, address=STREET 2, country=OFFICE Country, city=OFFICE City, addressType=OFFICE], EmployeeAddress [employeeId=1, address=STREET 1, country=HOME Country, city=HOME City, addressType=Home]], department=Department [departmentId=1, name=Software Development, description=Software Development]]

-----Mapped Employee---

EmployeeDTO [employeeId=1, employeeName=ABC, email=test@yahoo.com, mobilePhone=null, cellPhone=null, nickName=null, age=null, addresses=[EmployeeAddress [employeeId=1, employeeAddress=STREET 2, country=OFFICE Country, city=OFFICE City, addressType=OFFICE], EmployeeAddress [employeeId=1, employeeAddress=STREET 1, country=HOME Country, city=HOME City, addressType=Home]], department=Department [departmentId=1, departmentName=Software Development, description=Software Development]]




################## Strict Startegy ##################

Code:

    Employee e = Util.getDefaultEmployeeData();
    EmployeeDTO e2 = new EmployeeDTO();

    ModelMapper mapper = new ModelMapper();
    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    mapper.map(e, e2);
    

-----Actual Employee---

Employee [employeeId=1, name=ABC, email=test@yahoo.com, phone=12342134, addresses=[EmployeeAddress [employeeId=1, address=STREET 1, country=HOME Country, city=HOME City, addressType=Home], EmployeeAddress [employeeId=1, address=STREET 2, country=OFFICE Country, city=OFFICE City, addressType=OFFICE]], department=Department [departmentId=1, name=Software Development, description=Software Development]]

-----Mapped Employee---

EmployeeDTO [employeeId=1, employeeName=null, email=test@yahoo.com, mobilePhone=null, cellPhone=null, nickName=null, age=null, addresses=[EmployeeAddress [employeeId=1, employeeAddress=null, country=OFFICE Country, city=OFFICE City, addressType=OFFICE], EmployeeAddress [employeeId=1, employeeAddress=null, country=HOME Country, city=HOME City, addressType=Home]], department=Department [departmentId=1, departmentName=null, description=Software Development]]


