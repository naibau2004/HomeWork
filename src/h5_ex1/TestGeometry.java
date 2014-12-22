package h5_ex1;

public class TestGeometry {
	
	public static void main ( String [] args ){
		
		Geometry o = new Circle (30 , 2 , 3) ;
		System.out.println ( o.getArea() ) ;
		System.out.println ( o.getCoordinate() ) ;
		
		Geometry t = new Triangle (3 , 5) ;
		System.out.println (t.getArea()) ;
		System.out.println (t.getCoordinate()) ;
		
		Geometry q = new Quadrangle (4 , 8) ;
		System.out.println (q.getArea()) ;
		System.out.println (q.getCoordinate()) ;
		
	}
}

