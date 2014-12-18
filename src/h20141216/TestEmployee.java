package h20141216;

public class TestEmployee {
	
	public static void main ( String [] args ){
		
		Employee employee1 = new Employee ("Boss","2014-01-01" , "2014-12-31","Man", 100 , 160 ) ;
		Employee.setEmployee(employee1);
		employee1.setSkill("argue");
		employee1.setSkill("confuse");
		employee1.setSkill("22K");

		
		Employee employee2 = new Employee ("Manager","2014-01-02" , "2014-12-30","Woman", 80 , 170 ) ;
		Employee.setEmployee(employee2);
		employee2.setSkill("bypass");
		employee2.setSkill("KPI");
		

		Employee.getEmployee();
		System.out.println () ;
		
		Employee.removeEmployee(employee1);
		
		employee2.setTall(168);
		employee2.setWeight(90);
		
		Employee employee3 = new Employee ("Fiona","2014-01-03" , "2014-12-29","Woman", 165 , 52 ) ;
		Employee.setEmployee(employee3);
		employee3.setSkill("Universal");
		employee3.setSkill("Low wages");
		
		Employee.getEmployee();
		
	}
	
	
}
