package strategies.models;

import java.util.Set;

public class Employee {

	private Integer employeeId;
	private String email;
	private String phone;
	private String name;
	private Set<EmployeeAddress> addresses;
	private Department department;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<EmployeeAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<EmployeeAddress> addresses) {
		this.addresses = addresses;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", email=" + email +  ", phone=" + phone+ ", addresses=" + addresses
				+ ", department=" + department  + "]";
	}
	
	
}
