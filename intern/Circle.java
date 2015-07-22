public class Circle{
    private double radius;
    public Circle(double r){
        this.radius = r;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public static void main(String argv[]){
        Circle c = new Circle(20);
        System.out.println(c.getArea());
    }

}
