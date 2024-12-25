import java.util.Scanner;
public class cubeAndSquare {
    public static void main(String[] args) {
        double square=0;
        double cube=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        double num=sc.nextInt();
        square=Math.pow(num,2);
        cube=Math.pow(num,3);
        System.out.println("Square is : "+ square);
        System.out.println("Cube is : "+ cube);
        
    }
    
}
