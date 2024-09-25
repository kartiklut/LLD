
public class EmployeeFactory {

	public Employee getEmployee(String employeeType) {
		if(employeeType.equals("MANAGER")) {
			return new ManagerEmployee();
		}else if(employeeType.equals("DESIGNER")) {
			return new DesignerEmployee();
		} else if(employeeType.equals("DEVELOPER")) {
			return new DeveloperEmployee();
		}else {
			return null;
		}
	}
	
}
