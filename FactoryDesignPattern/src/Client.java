
public class Client {

	public static void main(String[] args) {
		EmployeeFactory employeeFactory=new EmployeeFactory();
		Employee manager=employeeFactory.getEmployee("MANAGER");
		System.out.println(manager.getName());
		
		Employee designer=employeeFactory.getEmployee("DESIGNER");
		System.out.println(designer.getName());
		
		Employee developer=employeeFactory.getEmployee("DEVELOPER");
		System.out.println(developer.getName());

	}

}
