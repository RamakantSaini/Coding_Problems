import java.util.Scanner;

public class largestOfThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        Double num1=sc.nextDouble();
        System.out.print("Enter the second number : ");
        Double num2=sc.nextDouble();
        System.out.print("Enter the third number : ");
        Double num3=sc.nextDouble();
        if(num1>=num2){
            if(num1>=num3){
                System.out.println(num1 + " is greater");
            }else{
                System.out.println(num3 + " is greater");
            }
        }else{
            if(num2>=num3){
                System.out.println(num2 + " is greater");
            }else{
                System.out.println(num3 + " is greater");
            }
        }
    }
}

    
