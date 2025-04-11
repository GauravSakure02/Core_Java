package objectclass;
class Employee {
	
	private int eno;
	private String ename;
	private String dept;
	private double sal;

	public Employee(int eno, String ename, String dept, double sal) {
		this.eno = eno;
		this.ename = ename;
		this.dept = dept;
		this.sal = sal;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public int hashCode() {
		return dept.hashCode(); //hashing algorithm
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee emp) { //Java 14v new feature
											//Pattern matching for instanceof operator
			return this.dept.equals(emp.dept) &&
					this.eno == emp.eno;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "\nEmployee("+eno+", "+ ename + ", "+ dept+ ", "+ sal +")";
	}
	
}