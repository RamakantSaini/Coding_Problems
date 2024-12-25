import java.util.Scanner;
public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter your first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter your second number : ");
        int num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("Sum of your numbers is : "+ sum);
        
    }
}
