package constructor;

import java.util.Scanner;

class BikeRider {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Bike bike = new Bike("xyz123Abc456", "RED WINE");
		bike.setOwnerName("Hari Krishna");
		bike.setBikeNumber("TG 09 BJ 1234");

		System.out.println("The customer " + bike.getOwnerName() + " has bought "
							+ bike.getBrand() + " bike");
		loop: while(true) {
			System.out.println("\nChoose one option");
			System.out.println(" 1. Display bike details");
			System.out.println(" 2. start bike");
			System.out.println(" 3. move bike");
			System.out.println(" 4. stop bike");
			System.out.println(" 5. exit");

			System.out.print("Enter option: ");
			int option = scn.nextInt(); scn.nextLine();

			switch(option) {
				case 1 : {
					System.out.println("Bike details");
					System.out.println(bike);
					break;
				}

				case 2 : {
					bike.start();
					break;
				}

				case 3 : {
					bike.move();
					break;
				}

				case 4 : {
					bike.stop();
					break;
				}

				case 5 : {
					System.out.println("Engine stopped");
					break loop; //label
				}

				default : {
					System.out.println("Invalid option");
				}
			}//switch close
			System.out.println("after switch");

		}//while close
		System.out.println("After loop, program terminated");
		
	}
}