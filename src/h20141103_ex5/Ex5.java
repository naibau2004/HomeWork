package h20141103_ex5;

import h20141103_ex2.Ex2;

public class Ex5 
{
	int bigNum ;					//建立2個成員變數用於承接參數
	int smallNum ;					//建立2個成員變數用於承接參數

	public int getGCD ( int a , int b )
	{
		if ( (a < 0) || (b < 0) )						//判斷參數是否有小於0的值，
		{
			System.out.println ( "參數不得小於零" ) ;	//若有則產生訊息
			System.exit(0) ;							//中斷程式
			
		}else if ( a > b )								//調整參數大小順序
		{
			bigNum = a ;								//較大值給bigNum變數			
			smallNum = b ;								//較小值給smallNum變數
			
		}else											//不是a > b的話就是a = b 或a < b
		{
			bigNum = b ;								//較大值給bigNum變數，若兩數相同則不影響
			smallNum = a ;								//較小值給smallNum變數，若兩數相同則不影響
		}
		
		if ( (bigNum % smallNum) !=0 )					//判斷大值除以小值若餘數不為零的話
		{
			getGCD(smallNum, (bigNum % smallNum) ) ;	//就呼叫自身方法，將較小數及餘數放入(此時較小數變為較大數，而餘數變為較小數)
		}
		if ( (bigNum % smallNum) == 0 )					//一直除到剩下零的時候
		{
			return smallNum ;							//將較小數回傳，為最大公因數
		
		}else
		{
			return 0;									//以上皆不符合則回傳0表示錯誤
		}
	}

	public static void main ( String [] args )			//驗證以上方法
	{
		Ex5 getGCD = new Ex5() ;						//利用本身類別建立一個物件
		int bigNum = 813 ;								// 建立2變數存放大值與小值
		int smallNum = 273 ;							// 建立2變數存放大值與小值
		
		int answer = getGCD.getGCD( bigNum , smallNum ) ;	//呼叫物件下的方法，將2數值放入
		System.out.println ( bigNum + "和" + smallNum + "的最大公因數為: " + answer ) ;
	}
}
