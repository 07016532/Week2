package Problem1;
import java.util.Scanner;

public class Person {
	
	String forename;
	String surname;
	String email;
	int age;
	String mobileNo;
	Scanner kboard = new Scanner(System.in);
	
	public Person(){

		this.getForename();
		this.getSurname();
		this.getEmail();
		this.getMobile();
		this.getAge();
		this.displayPerson();
	
	}
	
	public Person(String forename, String surname)
	  {
		this.forename = forename;
		this.surname = surname;
	  }

	public Person(String forename, String surname,int age)
	  {
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	  }

	
	public void displayPerson(){
		System.out.println(forename);
		System.out.println(surname);
		System.out.println(email);
		System.out.println(age);
		System.out.println(mobileNo);
	}
	
	public void getForename(){
		System.out.println("Please enter forename");
		forename = kboard.next();
	}
	
	public void getSurname(){
		System.out.println("Please enter surname");
		surname = kboard.next();
	}
	
	public void getEmail(){
		System.out.println("Please enter email");
		email = kboard.next();
	}
	
	public void getMobile(){
		System.out.println("Please enter mobile No.");
		mobileNo = kboard.next();
	}
	
	public void getAge(){
		System.out.println("Please enter age");
		age = kboard.nextInt();
		while (checkAge(age)!= true){
			System.out.println("Error: Age is less than 18");
			System.out.println("Please enter an age 18 or over");
			age = kboard.nextInt();
		}
	}
	
	private boolean checkAge(int age){
		boolean check = true;
		if(age < 18){
			check = false;
		}else{
			check = true;
		}
		return check;
	}
	
	
}

