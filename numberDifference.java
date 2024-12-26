import java.util.Scanner;
public class numberDifference{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the First number : ");
        double num1=sc.nextDouble();
        System.out.print("Enter the Second Number : ");
        double num2=sc.nextDouble();
        double diff=Math.abs(num1-num2);
        System.out.println("Difference of the given numbers is : " + diff);
    }

}
