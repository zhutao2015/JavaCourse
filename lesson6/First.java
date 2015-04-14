public class First{
    public double calculateArea(int radius){
       return 3.14 * radius * radius; 
    }
    
    public static void main(String arg[]){
        First f = new First();
        int radius = 10;
        System.out.printf("Area of ciclle(%d) is: %f\n", radius, f.calculateArea(radius));
    }
}
