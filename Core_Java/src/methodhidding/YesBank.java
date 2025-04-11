package methodhidding;

//sub class overriding super class provided functionality
class YesBank extends Bank {

	int getROI() {
		System.out.print("From YesBank ROI: ");
		return 7;
	}

}
