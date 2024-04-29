package Week1;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        /*system.out.println
         * 'sout'
         * ,
         * System.out.println("This line break");;
         */
        /*sytem.out.print */
        System.out.print("This will not break");
        System.out.print("This will continue\n");
        /*System.out.print()
         * % string,%d integer , %f floating point , %b boolean
         */
        System.out.printf("Hello %s,Good morning","World");
        System.out.printf("This is a num %d",10);
        /*multi format */
        System.out.printf("Both float %f and %b",10.3f,false);
        // Scanner scan = new Scanner(System.in);
        // System.out.println("the following takes sentences");
        // String stringInput = scan.nextLine();
        // System.out.println("The following takes int");
        // int input = scan.nextInt();
        // System.out.println("the following takes boolean");
        // boolean boolInput = scan.nextBoolean();
        
        /*class task */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scan1.nextLine();
        System.out.println("over 18");
        boolean boolage = scan1.nextBoolean();
        System.out.println("How many sibling");
        int sibling = scan1.nextInt();
        scan1.close();
        System.out.printf("Hello,%s",name);
        System.out.println("");
        System.out.printf("status?status,%b",boolage);
        System.out.println("");
        System.out.printf("you have %d num of siblings,%s",sibling);
    }
    
}
