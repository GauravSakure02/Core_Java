package collection1;
public class Student {
	
	private int sno;
	private String sname;
	private String course;
	private double fee;
	
	public Student(int sno, String sname, String course, double fee) {
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In eq: "+ this + "  " + obj);
		
		if(obj instanceof Student s) {
			
			return this.course.equals(s.course) 
					&& this.sno == s.sno;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "\nStudent(" + sno + ", " + sname + ", " + course + ", " + fee + ")";
	}
	
}