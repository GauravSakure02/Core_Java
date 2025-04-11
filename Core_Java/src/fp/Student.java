package fp;
public class Student implements Comparable<Student>{
	
	private int sno;
	private String sname;
	private String course;
	private double fee;
	
	public Student() { 
		//no-op
	}
	
	public Student(int sno, String sname, String course, double fee){ 
		this.sno	= sno;
		this.sname	= sname;
		this.course	= course;
		this.fee	= fee;
	}
	
	public void setSno(int sno){
		this.sno = sno;
	}
	
	public int getSno(){
		return sno;
	}

	public void setSname(String sname){
		this.sname = sname;
	}
	
	public String getSname(){
		return sname;
	}

	public void setCourse(String course){
		this.course = course;
	}
	
	public String getCourse(){
		return course;
	}

	public void setFee(double fee){
		this.fee = fee;
	}
	
	public double getFee(){
		return fee;
	}
	
	@Override
	public int compareTo(Student s) {
		int courseDiff = this.course.compareTo(s.course);
		if(courseDiff == 0) {
			return this.sno - s.sno;
		}
		return courseDiff;
	}
	
	@Override
	public String toString() {
		return "\nStudent("+sno + " " + sname + " " + course+ " " + fee+")";	
	}

}