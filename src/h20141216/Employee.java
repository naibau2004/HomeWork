package h20141216;

/*練習二
 * 依照以下敍述,設計出相關類別:
 * 某公司有員工數十人,員工在進入公司後,均會分配一個編號,此編號為一流水號。
 * 公司亦會紀錄員工的姓名,出生日,進入公司的日期,之外,一些基本屬性亦會詳加記載,例如:性別,身高,體重及專長。
 * 公司在成立時並不會有任何員工,必須提供員工加入及員工離職的功能
 * 員工資料一但被建立後,他們的編號,姓名,生日,進公司日期,性別均只能被讀取而不能再改變
 * 註:日期型別尚未教授,但可自行去查看看,如果有困難,可以字串代替
 */

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

	//建立一個方法，用來提供員工用之流水號
	private int getID () {
		flowid ++ ;
		this.id = flowid ;
		
		return this.id ;
	}
	
	//建立一個方法，用來將員工資料放人員工清單中，使用static可以讓main方法拆分至獨立的類別
	public static void setEmployee ( Employee people2 ){
		people.add(people2)	;
	}
	
	//建立一個方法，用來將員工資料從員工清單中移除，使用static可以讓main方法拆分至獨立的類別
	public static void removeEmployee ( Employee people2 ){
		people.remove(people2) ;
	}
	
	//取得員工清單的資料
	public static void getEmployee ( ) {
		for ( Employee items : people ){
			System.out.println ( items.toString() ) ;
		}
	}
	
	//此方法可以用來修改員工體重
	public void setWeight(int weight) {
		this.weight = weight;
	}

	//此方法可以用來修改員工身高
	public void setTall(int tall) {
		this.tall = tall;
	}
	
	//此方法可以用來增加員工專長
	public void setSkill ( String skill ){
		
		this.skill.add(skill) ;
	}
	
	//此方法用來回傳員工資料
	@Override
	public String toString() {
		return "Employee [ID= " + id + ", Name= " + name + ", BirthDay= "
				+ birthDate + ", ComingDay= " + comeDate + ", Gender= " + gender
				+ ", Weight= " + weight + ", Tall= " + tall + ", Skill= " + skill + "]" ;
				
	}
	
	
	//以上程式碼之測試
	public static void main ( String [] args ){
		
		//建立一個員工，將基本資料填寫
		Employee employee1 = new Employee ("Eric","2014-01-01" , "2014-12-31","Man", 100 , 160 ) ;
		Employee.setEmployee(employee1);
		employee1.setSkill("Business");
		employee1.setSkill("Manage");

		//建立第二個員工，將基本資料填寫
		Employee employee2 = new Employee ("Fiona","2014-01-02" , "2014-12-30","Woman", 80 , 170 ) ;
		Employee.setEmployee(employee2);
		employee2.setSkill("Computer");
		employee2.setSkill("Network");
		
		//列印剛剛建立的員工資訊
		Employee.getEmployee();
		System.out.println () ;
		
		//將第一位員工剔除
		Employee.removeEmployee(employee1);
		
		//修改第二位員工資料
		employee2.setTall(168);
		employee2.setWeight(90);
		
		//新增第三位員工資料
		Employee employee3 = new Employee ("Fiona","2014-01-03" , "2014-12-29","Woman", 165 , 52 ) ;
		Employee.setEmployee(employee3);
		employee3.setSkill("Universal");
		employee3.setSkill("Low wages");
		
		//查看流水號與修改資料是否成功
		Employee.getEmployee();
		
	}

}


