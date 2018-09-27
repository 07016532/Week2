package Problem2;
import java.text.DecimalFormat;

public class Circle extends Launcher {
	
	private double radius;
	private double area;
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	public Circle(){
		
		this.getRadius();
		this.calcArea(radius);
		this.displayAll(radius, area);
		
	}
	
	public double getRadius(){
		System.out.println("Please enter a radius");
		radius = kboard.nextDouble();
		return radius;
	}
	
	public double calcArea(double radius){
		area = Math.PI*(radius*radius);
		return area;
	}
	
	public void displayAll(double radius, double area){
		System.out.println("Radius = "+radius);
		System.out.println("Area = "+df.format(area));
	}

}
