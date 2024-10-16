import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Given Number: " + n);
        System.out.println("Binary equivalent: " + Integer.toBinaryString(n));
        System.out.println("Octal equivalent: " + Integer.toOctalString(n));
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(n));
	}

}
