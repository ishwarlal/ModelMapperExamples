package strategies.models;

public class EmployeeAddressDTO {

	private Employee employee;
	private String employeeAddress;
	private String country;
	private String city;
	private String addressType;//Home / Office 
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [employeeId=" + (employee!=null?employee.getEmployeeId():"") + ", employeeAddress=" + employeeAddress + ", country=" + country + ", city="
				+ city + ", addressType=" + addressType + "]";
	}
	
	
}
