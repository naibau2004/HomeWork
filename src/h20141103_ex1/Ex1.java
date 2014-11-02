package h20141103_ex1;

public class Ex1
{
	public static String [] intChangeFourString ( int x )		//ミよ猭琵计锣4计﹃
	{
		if ( x < 10 )											//块计计
		{
			String []  tempArray = new String [4] ;				//ミ皚ノㄓ┯钡κ计计
			String a = "0" ;									//絛瞅1-9盢计干0
			String b = "0" ;									//絛瞅1-9盢κ计干0
			String c = "0" ;									//絛瞅1-9盢计干0
			String d = Integer.toString( x ) ;					//盢x(1-9)锣﹃
			
			tempArray[0] = a ;									//ㄏノ皚┯钡计﹃
			tempArray[1] = b ;									//ㄏノ皚┯钡κ计﹃							
			tempArray[2] = c ;									//ㄏノ皚┯钡计﹃
			tempArray[3] = d ;									//ㄏノ皚┯钡计﹃
			
			return tempArray ;									//肚计皚
			
			
		}else if ( (x >= 10) && (x <100) )						//块计计
		{
			String []  tempArray = new String [4] ;
			
			String tempX = Integer.toString( x ) ;				//盢x(10-99)锣﹃
			String a = "0" ;									//絛瞅10-99盢计干0
			String b = "0" ;									//絛瞅10-99盢κ计干0
			String c = tempX.substring(0,1) ;					//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			String d = tempX.substring(1,2) ;					//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			
			tempArray[0] = a ;									//ㄏノ皚┯钡计﹃
			tempArray[1] = b ;									//ㄏノ皚┯钡κ计﹃							
			tempArray[2] = c ;									//ㄏノ皚┯钡计﹃
			tempArray[3] = d ;									//ㄏノ皚┯钡计﹃
			
			return tempArray ;									//肚计皚
			
		}else if ( (x >= 100) && (x < 1000) )					//块计κ计
		{
			String []  tempArray = new String [4] ;				//ミ皚ノㄓ┯钡κ计计
			
			String tempX = Integer.toString( x ) ;				//盢x(100-999)锣﹃	
			String a = "0" ;									//絛瞅100-999盢计干0
			String b = tempX.substring(0,1) ;					//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓκ计じ
			String c = tempX.substring(1,2) ;					//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			String d = tempX.substring(2,3) ;					//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			
			tempArray[0] = a ;									//ㄏノ皚┯钡计﹃
			tempArray[1] = b ;									//ㄏノ皚┯钡κ计﹃							
			tempArray[2] = c ;									//ㄏノ皚┯钡计﹃
			tempArray[3] = d ;									//ㄏノ皚┯钡计﹃
			
			return tempArray ;									//肚κ计皚
			
		}else if ( (x >= 1000) && ( x < 10000) )				//块计计		
		{
			String []  tempArray = new String [4] ;				//ミ皚ノㄓ┯钡κ计计
			
			String tempX = Integer.toString( x ) ;				//盢x(1000-9999)锣﹃		
			String a = tempX.substring(0,1) ;					//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			String b = tempX.substring(1,2) ;					//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓκ计じ
			String c = tempX.substring(2,3) ;					//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			String d = tempX.substring(3,4) ;					//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			
			tempArray[0] = a ;									//ㄏノ皚┯钡计﹃
			tempArray[1] = b ;									//ㄏノ皚┯钡κ计﹃							
			tempArray[2] = c ;									//ㄏノ皚┯钡计﹃
			tempArray[3] = d ;									//ㄏノ皚┯钡计﹃
			
			return tempArray ;									//肚计皚
			
		}else
		{
			return null ;										//常ぃ才碞肚nullぃ穦Τ薄猵
		}
	}
	
	public static String[] getArray ()							//絤策1よ猭よ猭穦肚絤策1璶―皚
	{
		int counter = 0 ;										//ミ璸计竟ノㄓ癘魁Τ碭计穦才肈ヘ兵ン
		String [] arrayAll = new String [9999] ;				//ミ既ノ皚肈ヘ矗ㄑぇ  
		
		for ( int x = 1 ; x < 10000 ; x++ )						//ㄌ肈肈ヘ絛瞅1-9999ミ癹伴
		{
			String [] temp = intChangeFourString(x) ;			//盢x倒ぉintChangeForStringよ猭琵ウ玻ネ计皚
			
			String a = temp[0] ;								//盢玻ネ皚[0](计)倒ぉ跑计a
			String b = temp[1] ;								//盢玻ネ皚[1](κ计)倒ぉ跑计b
			String c = temp[2] ;								//盢玻ネ皚[2](计)倒ぉ跑计c
			String d = temp[3] ;								//盢玻ネ皚[3](计)倒ぉ跑计d
			
			//盢┮Τ逼舱秈︽耞
			if ( a.equals(b) || a.equals(c) || a.equals(d) || b.equals(c) || b.equals(d) || c.equals(d) )
			{
				arrayAll[x-1] = a + b + c + d  ;				//皚癬﹍0τx癬﹍1珿x-1τa+b+c+d = [1-9]+[0-9]+[0-9]+[0-9]
				counter = counter + 1 ;							//–才掸计玥璸计竟碞1	
			}	
		}
		
		String [] arrayFilter = new String [counter] ;			//ミ程沧璶眔皚(arrayFilter)皚玡璸计竟仓
		int counter2 = 0 ;										//ミ非称仓跑计
		
		for ( String item : arrayAll )							//盢玡9999皚ず甧
		{
			if ( ! ( item == null ) )							//耞ず甧琌(才璶―)
			{
				arrayFilter[counter2] = item ;					//盢ず甧峨穝皚
				counter2 = counter2 + 1 ;						//–糤皚ま璶1
			}
		}
		
		return arrayFilter ;									//盢程沧挡狦肚

	}

	public static void main ( String [] args )
	{
		for ( String item : Ex1.getArray() )					//喷靡程沧挡狦ず甧
		{
			System.out.println ( item ) ;
		}
	}
	
}