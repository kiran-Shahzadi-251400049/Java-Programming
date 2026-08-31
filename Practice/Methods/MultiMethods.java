import java.util.Scanner;
public class MultiMethods
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        double length = getLength(input);
        double width = getWidth(input);
        double area = getArea(length, width);
        display(length, width, area);

    }

    public static double getLength(Scanner input)
    {
        double length;
        do{
        System.out.print("Enter the length of rectangle: ");
        length = input.nextDouble();
        }while(length<0);
        return length;
    }

    public static double getWidth(Scanner input)
    {
        double width;
        do{
        System.out.print("Enter the width of rectangle: ");
        width = input.nextDouble();
        }while(width<0);
        return width;
    }

    public static double getArea(double length, double width)
    {
        double area = length*width;
        return area;
    }

    public static void display(double length, double width, double area)
    {
       System.out.println("Length is: "+ length);
       System.out.println("Width is: "+ width);
       System.out.println("Area is: "+ area);
    }
}//class