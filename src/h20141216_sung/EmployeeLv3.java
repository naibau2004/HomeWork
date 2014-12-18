package h20141216_sung;

/*依照以下敍述,設計出類別(1分)
 * 某公司有員工,除了老闆之外,每一位員工均有一個主管,主管也是員工
 * 這題僅需要設計員工類別及所需的屬性
 * 進階題(2分):設計一些員工,建立之間的關係,並以遞迴方式全部印出來
 */

import java.util.ArrayList;
import java.util.List;

public class EmployeeLv3 {
	
	//建立員工與ID與姓名屬性
    private String id;
    private String name;
    
    //建立一個型別為EmployeeLv3的屬性，代表員工的主管
    private EmployeeLv3 supervisor;
    
    //建立一個陣列，用來存放員工清單
    private List<EmployeeLv3> EmployeeLv3s = new ArrayList<EmployeeLv3>();   
    
    //設定物件初始化資訊
    public EmployeeLv3(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    //建立一個方法，用來將員工物件加入員工清單中
    public void addEmployeeLv3(EmployeeLv3 emp) {
        EmployeeLv3s.add(emp);
    }

    //建立一個方法，用來取得員工主管的物件
    public EmployeeLv3 getSupervisor() {
        return supervisor;
    }

    //建立一個方法，用來設定員工主管
    public void setSupervisor(EmployeeLv3 supervisor) {
        this.supervisor = supervisor;
    }
    
    //取得員工姓名
    public String getName() {
        return name;      
    }
    
    //列印員工的關係
    public void printAllEmployeeLv3s() {	
        System.out.println( name + " 的主管是" + this.getSupervisor().name );
        
        for (EmployeeLv3 emp : EmployeeLv3s) {
            emp.printAllEmployeeLv3s();
        }
    }

    public static void main(String[] args) {
    	
    	//建立老闆物件，老闆的主管是自已
        EmployeeLv3 boss = new EmployeeLv3( "0" , "Boss" );
        boss.setSupervisor(boss);
        
        //建立主管物件-Kevin，其主管是老闆
        EmployeeLv3 kevin = new EmployeeLv3( "1" , "Kevin" );
        kevin.setSupervisor(boss);
        
        //建立員工物件，員工的主管是Kevin
        EmployeeLv3 mary = new EmployeeLv3( "2" , "Mary" ); // 部屬1
        mary.setSupervisor(kevin);
        
        //建立員工物件，員工的主管是Kevin
        EmployeeLv3 john = new EmployeeLv3( "3" , "John" ); // 部屬2
        john.setSupervisor(kevin);

        //將員工資料納入員工清單中
        boss.addEmployeeLv3(kevin);
        kevin.addEmployeeLv3(mary);
        kevin.addEmployeeLv3(john);
        
        //列印員工關係
        boss.printAllEmployeeLv3s();
    }
    
}
