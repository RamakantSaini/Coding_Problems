import java.util.Scanner;
public class circleFunctions {
    public static void main(String[] args) {
        double area=0;
        double circumference=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius=sc.nextDouble();
        area=Math.PI*Math.pow(radius,2);
        circumference=2*Math.PI*radius;
        System.out.println("Area Of Circle is : "+ area);
        System.out.println("Circumference Of Circle is : "+ circumference);
    }
    
}
