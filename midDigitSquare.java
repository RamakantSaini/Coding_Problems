import java.util.Scanner;
public class midDigitSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int midDigit=0;
        System.out.print("Enter the three digit number : ");
        int num=sc.nextInt();
        if(num <= 99 || num >= 1000){
            System.out.println("invalid number");
        }else{
            midDigit=(num/10)%10;
        }
        System.out.println("Square of mid Digit is : " + Math.pow(midDigit,2));
    }
    
}
