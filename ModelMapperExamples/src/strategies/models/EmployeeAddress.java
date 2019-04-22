package strategies.models;

public class EmployeeAddress {

	private Employee employee;
	private String address;
	private String country;
	private String city;
	private String addressType;//Home / Office 
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
		return "EmployeeAddress [employeeId=" + (employee!=null?employee.getEmployeeId():"") + ", address=" + address + ", country=" + country + ", city="
				+ city + ", addressType=" + addressType + "]";
	}
	
	
}
