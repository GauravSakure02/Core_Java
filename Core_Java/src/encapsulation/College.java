package encapsulation;
class College {
    public static void main(String[] args) {
	
	Person p1 = new Person();	//super class reference
	p1.name		= "HK";		//accessing super class member -> allowed
	//p1.sno	= 101;	//CE	//accesssing sub class members -> not allowed
	//p1.course	= 101;	//CE

	
	Student s1 = new Student();	//sub class reference
	s1.name		= "HK";		//accessing sub class and	
	s1.sno		= 101;		//sub class mebmers 
	s1.course	= "LKG";	//no error	

	s1.listen();
	s1.reply();
	s1.write();
	s1.read();

	s1.eat();
	s1.sleep();

    }
}