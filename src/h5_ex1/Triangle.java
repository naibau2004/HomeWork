package h5_ex1;

public class Triangle extends Geometry {
	
	private double x ;
	private double y ;
	
	public Triangle(int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	@Override
	public double getArea() {
		
		return (x * y)/2 ;
		
	}
	
	@Override
	public String getCoordinate() {
		
		return "(" + (int)x + ",0)" + "(0," + (int)y + ")" ;
		
	}
	
	

}
