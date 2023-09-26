public class Rectangle {
     double width;
     double height;

    public static void main(String[] args) {
        Rectangle Rect = new Rectangle(5.0, 7.0);
        double area = Rect.calculateArea();
        double perimeter = Rect.calculatePerimeter();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double calculateArea() {
        return width * height;
    }


    public double calculatePerimeter() {
        return 2 * (width + height);
    }

}
































/**import java.util.Scanner;
public class Rectangle {

    public static void main(String[]args){
        double w=0;
        double h=0;
        double[] arr;
        arr=Rectangle(w,h);
        System.out.println(calculateArea(arr));
        System.out.println(calculatePerimeter(arr));

    }
    public static double[] Rectangle(double width,double height){
        double[] arr = new double[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width then enter height");
        for(int i =0;i<2;i++){
            arr[i]=sc.nextDouble();
        }
        return arr;
    }
    public static double calculateArea(double[] ar){
        double z = 0;

         z= ar[0]*ar[1];
        return z;
    }
    public static double calculatePerimeter(double[] ar){
        double c = 0;
        c=2*(ar[0]+ar[1]);
        return c;
    }
}
/**/