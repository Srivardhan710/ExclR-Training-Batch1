
import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two number:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1>number2) {
            System.out.println(number1+" is greater");
        }
        else{
            System.out.println(number2+" is greater");
        }
        sc.close();
    }
}

