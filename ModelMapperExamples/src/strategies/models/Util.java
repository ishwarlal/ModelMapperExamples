package strategies.models;

import java.util.HashSet;
import java.util.Set;

public class Util {

	public static Employee getDefaultEmployeeData(){
		
		Employee e = new Employee();
		e.setEmployeeId(1);
		e.setName("ABC");
		e.setEmail("test@yahoo.com");
		e.setPhone("12342134");
		
		Set<EmployeeAddress> addresses = new HashSet<EmployeeAddress>();
		EmployeeAddress homeAddress = new EmployeeAddress();
		homeAddress.setEmployee(e);
		homeAddress.setAddressType("Home");
		homeAddress.setAddress("STREET 1");
		homeAddress.setCountry("HOME Country");
		homeAddress.setCity("HOME City");
		
		EmployeeAddress officeAddress = new EmployeeAddress();
		officeAddress.setEmployee(e);
		officeAddress.setAddressType("OFFICE");
		officeAddress.setAddress("STREET 2");
		officeAddress.setCountry("OFFICE Country");
		officeAddress.setCity("OFFICE City");
		
		addresses.add(homeAddress);
		addresses.add(officeAddress);
		e.setAddresses(addresses);
		
		
		Department department = new Department();
		department.setDepartmentId(1);
		department.setName("Software Development");
		department.setDescription("Software Development");
		e.setDepartment(department);
		
		
		return e;
	}
}
