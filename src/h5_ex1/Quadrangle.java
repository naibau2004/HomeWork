package h5_ex1;

public class Quadrangle extends Geometry {

	private int x ;
	private int y ;
	
	public Quadrangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getArea() {
		return x * y ;
	}

	@Override
	public String getCoordinate() {
		return "(" + x + "," + y + ")" ;
		
	}
	
	
	

}
