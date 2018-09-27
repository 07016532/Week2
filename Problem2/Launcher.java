package Problem2;
import java.util.Scanner;

public class Launcher {
	
	public static Scanner kboard = new Scanner(System.in);
	
	public static void main(String [] args){
		
		boolean exit = false;
		
		do {
		System.out.println("\n1. for Rectangle");
		System.out.println("2. for circle");
		System.out.println("3. to exit");
		int choice = kboard.nextInt();

			switch(choice){
				
			case 1: 
				Rectangle rect = new Rectangle();
				break;
			case 2:
				Circle circ = new Circle();
				break;
			case 3:
				System.out.println("Bye!");
				exit = true;
				kboard.close();
				break;
			}
		}while(exit == false);	
	}

}
