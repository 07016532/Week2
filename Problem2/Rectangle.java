package Problem2;
import java.util.Scanner;

public class Rectangle extends Launcher{
	private int height;
	private int width;
	private int area;
	private boolean square = false;
	
	public Rectangle(){
		this.getHeight();
		this.getWidth();
		this.calcArea(height, width);
		this.isSquare(height, width);
		this.displayAll(height, width, area, square);
	}
	
	public int getHeight(){
		System.out.println("Please enter the height");
		height = kboard.nextInt();
		return height;
	}
	
	public int getWidth(){
		System.out.println("Please enter the width");
		width = kboard.nextInt();
		return width;
	}
	
	public int calcArea(int height, int width){
		area = height*width;
		return area;
	}
	
	public boolean isSquare(int height, int width){
		if(height == width){
			square = true;
		}else {
			square = false;
		}
		return square;
	}
	
	private void displayAll(int height, int width, int area, boolean square){

		System.out.println("Height = "+height);
		System.out.println("Width = "+width);
		System.out.println("Area = "+area);
		if(square = true) {
			System.out.println("It's a square!");
		}else {
			System.out.println("It's not a square!");
		}
	}
}
