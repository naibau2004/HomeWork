package h20141216;

import java.util.ArrayList;

public class Employee {
	
	private static int flowid ;				//流水號ID
	private int id ;							//員工ID
	private String name ;						//員工姓名
	private String birthDate ;					//員工生日
	private String comeDate ;					//員工到職日
	private String gender ;						//員工姓別
	private int  weight ;						//員工重量
	private int tall ;							//員工身高
	
	private ArrayList<String> skill = new ArrayList<String>()  ;					//員工專長
	private static ArrayList<Employee> people = new ArrayList <Employee> () ;		//員工清單

	//設定員工基本資料
	public Employee( String name, String birthDate, String comeDate, String gender, 
					  int weight, int tall) {
		
		this.id = getID () ;
		this.name = name;
		this.birthDate = birthDate;
		this.comeDate = comeDate;
		this.gender = gender;
		this.weight = weight;
		this.tall = tall;
		
	}

	private int getID () {
		flowid ++ ;
		this.id = flowid ;
		
		return this.id ;
	}
	
	public static void setEmployee ( Employee people2 ){
		people.add(people2)	;
	}
	
	public static void removeEmployee ( Employee people2 ){
		people.remove(people2) ;
	}
	
	public static void getEmployee ( ) {
		for ( Employee items : people ){
			System.out.println ( items.toString() ) ;
		}
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setTall(int tall) {
		this.tall = tall;
	}
	
	
	public void setSkill ( String skill ){
		
		this.skill.add(skill) ;
	}
	
	@Override
	public String toString() {
		return "Employee [ID= " + id + ", Name= " + name + ", BirthDay= "
				+ birthDate + ", ComingDay= " + comeDate + ", Gender= " + gender
				+ ", Weight= " + weight + ", Tall= " + tall + ", Skill= " + skill + "]" ;
				
	}
	

}


