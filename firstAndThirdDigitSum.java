import java.util.Scanner;
public class firstAndThirdDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int firstDigit=0;
        int thirdDigit=0;
        int sum=0;
        int num=sc.nextInt();
        if(num <= 99 || num >= 1000){
            System.out.println("Invalid number");
        }else{
            firstDigit=num/100;
            thirdDigit=num%10;
            sum=firstDigit+thirdDigit;
            System.out.println("Sum is : " + sum);
        }
    }
    
}
