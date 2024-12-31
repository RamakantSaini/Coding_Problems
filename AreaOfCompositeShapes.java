import java.util.Scanner;
public class AreaOfCompositeShapes {
    public static double calculateArea(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the shape (Rectangle,circle,triangle): ");
        String shape=sc.nextLine().toLowerCase();
        double area=0;
        switch(shape){
            case "rectangle":
                area = calculateRectangleArea(sc);
                break;
            case "circle":
                area = calculateCircleArea(sc);
                break;
            case "triangle":
                area = calculateTriangleArea(sc);
                break;
            default:
                System.out.println("inavlid! shape");
        }
        return area;
    }
        //Method for finding area of rectangle
    private static double calculateRectangleArea(Scanner sc){
        System.out.print("Enter the length : ");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth : ");
        double breadth=sc.nextDouble();
        return(length*breadth);
    }
    // method for finding area of circle
    private static double calculateCircleArea(Scanner sc){
        System.out.print("Enter the radius of circle : ");
        double radius=sc.nextDouble();
        return (Math.PI*Math.pow(radius,2));
    }
    ///method for finding area of triangle
    private static double calculateTriangleArea(Scanner sc){
        System.out.print("Enter the base : ");
        Double base=sc.nextDouble();
        System.out.print("Enter the height : ");
        double height=sc.nextDouble();
        return(base*height)/2;
    }
    public static void main(String[] args) {
        System.out.println("Area : " + calculateArea());
    }
}
