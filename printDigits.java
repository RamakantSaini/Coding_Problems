import java.util.Scanner;
public class printDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter fours digit number : ");
        int num=sc.nextInt();
        if(num <= 999 || num >= 10000){
            System.out.println("invalid numbers");
        }else{
            int firstDigit=num / 1000;
            int secDigit=(num % 1000)/100;
            int thirdDigit=(num % 100)/10;
            int fourthDigit=(num % 10);
            System.out.println("first Digit is : " + firstDigit);
            System.out.println("Second Digit is : " + secDigit);
            System.out.println("Third Digit is : " + thirdDigit);
            System.out.println("Fourth Digit is : " + fourthDigit);
        }
        
    }
    
}
