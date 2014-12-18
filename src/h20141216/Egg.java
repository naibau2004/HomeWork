package h20141216;

public class Egg {
	
	//此變數為蛋數量的共同存放點
	private static int totalEggs ;
	
	//建立一個變數存放每日下蛋的數量
	private int eggs ;
	
	//物件建立時就執行下蛋的方法
	public Egg () {
		pushEgg() ;
	}
	
	//此部份為下蛋的實際方法
	private void pushEgg () {
		for ( int i = 1 ; i <= 20 ; i++ ){
			eggs = (int) ( Math.random() * 3 + 1 ) ;
			totalEggs = totalEggs + eggs ;
		}
	}

	//取得全部蛋數的方法
	public int getEgg () {
		
		return totalEggs ;
	}
	
	
	//測試
	public static void main ( String [] args ) {
		
		//建立五隻雞
		Egg e1 = new Egg () ;
		Egg e2 = new Egg () ;
		Egg e3 = new Egg () ;
		Egg e4 = new Egg () ;
		Egg e5 = new Egg () ;
		
		//取得五隻雞20天的蛋數
		System.out.println ( e1.getEgg() ) ;
			
	}
}
