package com.tusheng.lesson5;
public class Main {
	// 不使用多态
//	public static void printRectArea(Rectangle rects[]){
//		for(Rectangle rect : rects){
////		for(int i=0; i<rects.length; i++){
////			Rectangle rect = rects[i];
//			System.out.println("Area for "+rect.toString()+" is:" + rect.calculateArea());
//		}
//	}
//	
//	public static void printCircleArea(Circle circles[]){
//		for(Circle circle : circles){
//			System.out.println("Area for "+circle.toString()+" is:" + circle.calculateArea());
//		}
//	}
	
	// 使用多态
	public static void printArea(Shape shapes[]){
		for(Shape shape : shapes){
			System.out.println("Area for "+shape.toString()+" is:" + shape.calculateArea());
		}
	}
	public static void main(String[] args) {
		Shape[] shapes = {new Rectangle(2, 3), new Circle(10),
				new Circle(2), new Rectangle(5, 4), new Shape()};
		printArea(shapes);
//		Rectangle rects[] = {new Rectangle(2, 3),new Rectangle(5, 4)};
//		Circle circles[] = {new Circle(10), new Circle(2)};
//		printRectArea(rects);
//		printCircleArea(circles);
	}

}
