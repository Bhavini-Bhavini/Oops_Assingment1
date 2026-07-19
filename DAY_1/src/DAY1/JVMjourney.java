
package DAY1;
import java.util.Scanner;
public class JVMjourney {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("JVM Execution Journey");
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.println("Student: " + studentName);

        String S1 = "Java Source Code (.java)";
        String S2 = "Java Compiler (javac)";
        String S3 = "Bytecode (.class)";
        String S4 = "Class Loader";
        String S5 = "JVM Execution Engine";
        String S6 = "Machine Output";

        System.out.println("1. " + S1);
        System.out.println("2. " + S2);
        System.out.println("3. " + S3);
        System.out.println("4. " + S4);
        System.out.println("5. " + S5);
        System.out.println("6. " + S6);

        sc.close();
    }    
}
