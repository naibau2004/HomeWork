package h5_ex1;

public class Circle extends Geometry {

	private double diameter ;
	private int x ;
	private int y ;
	
	private double area ;
	public Circle ( double diameter , int x , int y ){
		
		this.diameter = diameter ;
		this.x = x ;
		this.y = y ;
	}
	
	@Override
	public double getArea (){
		this.area = this.diameter * Math.PI ;	
		return this.area ;
	}
	
	@Override
	public String getCoordinate (){
		return "(" + x + "," + y + ")" ;
	}
}
