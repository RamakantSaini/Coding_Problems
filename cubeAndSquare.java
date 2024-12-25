import java.util.Scanner;
public class cubeAndSquare {
    public static void main(String[] args) {
        int square=0;
        int cube=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=sc.nextInt();
        square=num*num;
        cube=square*num;
        System.out.println("Square is : "+ square);
        System.out.println("Cube is : "+ cube);
        
    }
    
}
