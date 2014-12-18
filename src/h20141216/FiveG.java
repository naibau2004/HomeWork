package h20141216;

public class FiveG 
{
	//設定一個屬性用來代表每日蛋量
	private int tempEgg ;
	
	//設定一個屬性用來代表總共蛋量
	private static int allEgg ;

	//此方法為雞下蛋的動作
	public void getEgg ()
	{
		for ( int x = 1 ; x <= 20 ; x++ ) 
		{
			tempEgg = (int) (Math.random() * 3 + 1 ) ;
			allEgg = allEgg + tempEgg ;
		}
	}
		
	//此方法為取得總共多少蛋
	public int getAllEgg () 
	{
		return allEgg ;
	}
	
	
	public void main ( String [] args )
	{
		//建立五個雞的物件
		FiveG fg1 = new FiveG () ;
		FiveG fg2 = new FiveG () ;
		FiveG fg3 = new FiveG () ;
		FiveG fg4 = new FiveG () ;
		FiveG fg5 = new FiveG () ;
		
		//讓五隻雞下蛋
		fg1.getEgg();
		fg2.getEgg();
		fg3.getEgg();
		fg4.getEgg();
		fg5.getEgg();
		
		//取得五隻雞20天的總蛋量
		fg5.getAllEgg() ;
	}
}
