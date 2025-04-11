package objectclass;
public class Sample2 {

	private int x;
	private int y;

	public Sample2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override     //s1.hashCode()
	public int hashCode() { //this[s1/s2/s3]
		return this.x;
	}
	
	@Override
	public boolean equals(Object obj) { //this[s1] and obj[s2]
		
		if(obj instanceof Sample2) {
			Sample2 s = (Sample2)obj;  //s[s2]
			
			return (this.x  ==  s.x) 
						&&	(this.y  ==  s.y); 
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "Sample2("+x+", "+y+")";
	}
}