import java.util.Scanner;

public class MainclassForMultiple {

	public static void main(String[] args) {
		Scanner YO = new Scanner(System.in);
		char choice;
		int a;
		a = 45;
		
		while (a == 45) {
		System.out.println("WELCOME TO THE FIRST FULL CALCULATOR!");
		System.out.println("ENTER THE RESPECTIVE NUMBER FOR YOUR RESPECTIVE FUNCTION");
		System.out.println("a. ADDITION");
		System.out.println("b. SUBTRACTION");
		System.out.println("c. MULTIPLICATION");
		System.out.println("d. DIVISION");
		
		choice = YO.next().charAt(0);
		
		switch (choice) {
		case 'a':
			AdditionMClass AdditionMClassObject = new AdditionMClass();
			AdditionMClass.main(args);
			break;
		
		case 'b':
			SubMClass SubMClassObject = new SubMClass();
			SubMClass.main(args);
			break;
			
		case 'c':
			MulMClass MulMClassObject = new MulMClass();
			MulMClassObject.main(args);
			break;
			
		case 'd':
			DivMClass DivMClassObject = new DivMClass();
			DivMClassObject.main(args);
			break;
		default:
			System.out.println("THE VALUE HAS NO FUNCTION, TYPE A VALUE FROM a,b,c AND d");
			System.out.println();
		break;
		}		
	}
	}

}
