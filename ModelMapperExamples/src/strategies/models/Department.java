package strategies.models;

public class Department {

	private Integer departmentId;
	private String name;
	private String description;
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
