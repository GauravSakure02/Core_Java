package methodhidding;
//sub class overriding super class provided functionality
class KotakBank extends Bank {

	int getROI() {
		System.out.print("From KotakBank ROI: ");
		return 6;
	}
}
