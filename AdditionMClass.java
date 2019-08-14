import java.util.Scanner;

public class AdditionMClass {

	public static void main(String[] args) {
	    Scanner YO = new Scanner(System.in);
	    double a,b,c;
	    
	    System.out.println("ENTER 1st NUMBER");
	    a = YO.nextDouble();
	    
	    System.out.println("ENTER 2nd NUMBER");
	    b = YO.nextDouble();
	    
	    c = a+b;
	    System.out.println("THE SUM IS " + c);
	    System.out.println();

	}

}
