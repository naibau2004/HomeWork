package h5_ex1;

public class Circle extends Geometry {

	private int Diameter ;
	private double area ;
	public Circle ( int Diameter ){
		
		this.Diameter = Diameter ;
	}
	
	public double getArea (){
		this.area = this.Diameter * Math.PI ;
		
		return this.area ;
	}
}
