import java.util.Scanner;

public class largestOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        Double num1=sc.nextDouble();
        System.out.print("Enter the second number : ");
        Double num2=sc.nextDouble();
        if(num1>num2){
            System.out.println(num1 + " is Greater");
        }else{
            System.out.println(num2 + " is Greater");
        }

    }
}
