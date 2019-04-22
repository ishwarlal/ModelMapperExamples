package strategies.models;

import java.util.Set;

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
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Set<EmployeeAddressDTO> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<EmployeeAddressDTO> addresses) {
		this.addresses = addresses;
	}
	public DepartmentDTO getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", mobilePhone=" + mobilePhone + ", cellPhone=" + cellPhone + ", nickName=" + nickName + ", age="
				+ age + ", addresses=" + addresses + ", department=" + department + "]";
	}
	
	
	
	
}
