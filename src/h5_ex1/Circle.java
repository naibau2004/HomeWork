package h5_ex1;

public class Circle extends Geometry {

	private double diameter ;
	private int x ;
	private int y ;
	
	private double area ;
	public Circle ( double diameter , int x ){
		
		this.diameter = diameter ;
		this.x = x ;	
	}
	
	public double getArea (){
		this.area = this.diameter * Math.PI ;	
		return this.area ;
	}
	
	public String getCoordinate (){
		return "(" + x + "," + y + ")" ;
	}
}
