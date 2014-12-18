package h20141216;

/*練習一
 * 試設計出一個類別能有以下功能
 * 我有5隻母雞,每隻母雞每天會下1-3個蛋
 * 這5隻母雞每次下完蛋都會在一個共同的地方記錄它下蛋的數量
 * 試寫一支程式模擬20天後,一共下了多少顆蛋
 */


public class Chicken {
	
	//建立一個變數用來存放全部產蛋的數量
	private static int eggTotal ;
	//建立一個變數用來表示共產幾天
	private int days ;
	//建立一個變數用來表示最小產蛋數 / 每日
	private int eggMin ;	
	//建立一個變數用來表示最大產蛋數 / 每日
	private int eggMax ;
	
	//建立一個建構式，將取得的參數寫入上述變數中
	public Chicken ( int eggMin, int eggMax , int days ) {	
		this.days = days;
		this.eggMin = eggMin;
		this.eggMax = eggMax;
		
		//當物件被建立的時候，產蛋工作隨即開始
		pullEgg() ;
	}
	
	//建立一個方法用於產蛋
	private void pullEgg () {
		for ( int i = 1 ; i <= days ; i++ ) {	
			int eggNum = (int) ( Math.random() * eggMax + eggMin ) ;
			
			//將每日產蛋數量存於「eggTotal」中
			eggTotal = eggTotal + eggNum ;
		}
	}

	//取得產蛋總數
	public static int getTotalEgg () {
		return eggTotal ;
	}
	
	//測試上述程式碼
	public static void main ( String [] args ) {
		
		//建立五個物件，將參數餵進去
		Chicken c1 = new Chicken ( 1 , 3 , 20 ) ;
		Chicken c2 = new Chicken ( 1 , 3 , 20 ) ;	
		Chicken c3 = new Chicken ( 1 , 3 , 20 ) ;
		Chicken c4 = new Chicken ( 1 , 3 , 20 ) ;
		Chicken c5 = new Chicken ( 1 , 3 , 20 ) ;
		
		//列印所有產蛋數量
		System.out.println ( Chicken.getTotalEgg() ) ;
	}
}
