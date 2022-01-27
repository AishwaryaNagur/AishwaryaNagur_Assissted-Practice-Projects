package classobjectsprog;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee (int id,String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getsalary() {
		return salary;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee e=new Employee(10201,"Tom",25000);
		System.out.println("Employeeid : "+e.getid());
		System.out.println("Employeename : "+e.getName());
		System.out.println("Employeesalary : "+e.getsalary());			
	}
}
