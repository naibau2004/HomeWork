package h20141103_ex2;

public class Ex2 
{
	public static String [] intChangeFourString ( int x )	//練習1的方法，讓數字轉為4位數字串
	{
		if ( x < 10 )											//輸入的數字為個位數
		{
			String []  tempArray = new String [4] ;				//建立一個陣列，用來承接千、百、十、個位數的數字
			String num1000 = "0" ;								//因範圍為1-9，將千位數補0
			String num100 = "0" ;								//因範圍為1-9，將百位數補0
			String num10 = "0" ;								//因範圍為1-9，將十位數補0
			String num1 = Integer.toString( x ) ;				//將x(1-9)轉為字串
			
			tempArray[0] = num1000 ;							//使用陣列承接千位數字串
			tempArray[1] = num100 ;								//使用陣列承接百位數字串							
			tempArray[2] = num10 ;								//使用陣列承接位位數字串
			tempArray[3] = num1 ;								//使用陣列承接個位數字串
			
			return tempArray ;									//回傳個位數的陣列
					
		}else if ( (x >= 10) && (x <100) )						//輸入的數字為十位數
		{
			String []  tempArray = new String [4] ;
			
			String tempX = Integer.toString( x ) ;				//將x(10-99)轉為字串
			String num1000 = "0" ;								//因範圍為10-99，將千位數補0
			String num100 = "0" ;								//因範圍為10-99，將百位數補0
			String num10 = tempX.substring(0,1) ;				//這邊使用java字串內建的方法(substing)，用來取出十位數的字元
			String num1 = tempX.substring(1,2) ;				//這邊使用java字串內建的方法(substing)，用來取出個位數的字元
			
			tempArray[0] = num1000 ;							//使用陣列承接千位數字串
			tempArray[1] = num100 ;								//使用陣列承接百位數字串							
			tempArray[2] = num10 ;								//使用陣列承接位位數字串
			tempArray[3] = num1 ;								//使用陣列承接個位數字串
			
			return tempArray ;									//回傳十位數的陣列
			
		}else if ( (x >= 100) && (x < 1000) )					//輸入的數字為百位數
		{
			String []  tempArray = new String [4] ;				//建立一個陣列，用來承接千、百、十、個位數的數字
			
			String tempX = Integer.toString( x ) ;				//將x(100-999)轉為字串	
			String num1000 = "0" ;								//因範圍為100-999，將千位數補0
			String num100 = tempX.substring(0,1) ;				//這邊使用java字串內建的方法(substing)，用來取出百位數的字元
			String num10 = tempX.substring(1,2) ;				//這邊使用java字串內建的方法(substing)，用來取出十位數的字元
			String num1 = tempX.substring(2,3) ;				//這邊使用java字串內建的方法(substing)，用來取出個位數的字元
			
			tempArray[0] = num1000 ;							//使用陣列承接千位數字串
			tempArray[1] = num100 ;								//使用陣列承接百位數字串							
			tempArray[2] = num10 ;								//使用陣列承接位位數字串
			tempArray[3] = num1 ;								//使用陣列承接個位數字串
			
			return tempArray ;									//回傳百位數的陣列
			
		}else if ( (x >= 1000) && ( x < 10000) )				//輸入的數字為千位數		
		{
			String []  tempArray = new String [4] ;				//建立一個陣列，用來承接千、百、十、個位數的數字
			
			String tempX = Integer.toString( x ) ;				//將x(1000-9999)轉為字串		
			String num1000 = tempX.substring(0,1) ;				//這邊使用java字串內建的方法(substing)，用來取出千位數的字元
			String num100 = tempX.substring(1,2) ;				//這邊使用java字串內建的方法(substing)，用來取出百位數的字元
			String num10 = tempX.substring(2,3) ;				//這邊使用java字串內建的方法(substing)，用來取出十位數的字元
			String num1 = tempX.substring(3,4) ;				//這邊使用java字串內建的方法(substing)，用來取出個位數的字元
			
			tempArray[0] = num1000 ;							//使用陣列承接千位數字串
			tempArray[1] = num100 ;								//使用陣列承接百位數字串							
			tempArray[2] = num10 ;								//使用陣列承接位位數字串
			tempArray[3] = num1 ;								//使用陣列承接個位數字串
			
			return tempArray ;									//回傳千位數的陣列
			
		}else
		{
			return null ;										//都不符合就回傳null，此例不會有此情況
		}
	}
	
	public static String[] getArray ()							//練習1的方法，此方法會回傳四位數兩兩相同數字的陣列
	{
		int counter = 0 ;										//建立一個計數器，用來記錄共有幾個數字會符合題目條件
		String [] arrayAll = new String [9999] ;				//建立一個暫存用陣列，大小為題目提供之大小  
		
		for ( int x = 1 ; x < 10000 ; x++ )						//依題題目範圍1-9999建立迴圈
		{
			String [] temp = intChangeFourString(x) ;			//將x值給予intChangeForString方法，讓它產生四位數的陣列
			
			String num1000 = temp[0] ;							//將產生的陣列[0](千位數)，給予變數a
			String num100 = temp[1] ;							//將產生的陣列[1](百位數)，給予變數b
			String num10 = temp[2] ;							//將產生的陣列[2](十位數)，給予變數c
			String num1 = temp[3] ;								//將產生的陣列[3](個位數)，給予變數d
			
			//將所有排列組合進行判斷
			if ( num1000.equals(num100) || num1000.equals(num10) || num1000.equals(num1) || num100.equals(num10) || num100.equals(num1) || num10.equals(num1) )
			{
				arrayAll[x-1] = num1000 + num100 + num10 + num1  ;	//陣列起始值為0，而x起始值為1，故x-1，而a+b+c+d = [1-9]+[0-9]+[0-9]+[0-9]
				counter = counter + 1 ;								//每符合一筆數字，則計數器就加1	
			}	
		}
		
		String [] arrayFilter = new String [counter] ;			//建立一個最終要取得的陣列(arrayFilter)，陣列大小為先前計數器的累加大小
		int counter2 = 0 ;										//建立一個準備累加的變數
		
		for ( String item : arrayAll )							//將先前9999大小的陣列內容取出
		{
			if ( ! ( item == null ) )							//判斷取出的內容是否含值(符合要求)
			{
				arrayFilter[counter2] = item ;					//將值的內容塞入新陣列
				counter2 = counter2 + 1 ;						//每增加一個值，陣列索引值要加1
			}
		}
		
		return arrayFilter ;									//將最終結果回傳
	}

	public static String[] newArray ()								//練習1的方法，此方法會回傳getArray()產生的陣列中所沒有的數字
	{
		String [] tempArray = new String[10000] ;					//建立一個9999+1的陣列，用來塞入1-9999的數，tempArray[0]為Null
		String [] oldArray = getArray() ;							//將練習1的方法取出，準備做計算
		String [] newArray = new String [9999-oldArray.length] ;	//建立一個陣列，用來存放oldArray中，1-9999所沒有的數，長度為9999-原陣列的長度
		int counter = 0 ;											//建立一個計數器，用來計算newArray的陣列大小
		
		for ( String item : oldArray )								//將練習1的陣列逐一取出
		{
			int intItem = Integer.parseInt(item) ;					//將取出的值轉為數字，0001 = 1 ; 0099 = 99 ...
			tempArray[intItem] = item ;								//讓tempArray[1] = 1 ; tempArray[100] = 100 ...tempArray[9999] = 9999
		}
		
		for ( int x = 1 ; x < 10000 ; x++ )							//因為沒有temp[0]=0 ; 故迴圈從1開始
		{
			if ( tempArray[x] == null )								//若先前的tempArray[x]為Null的話，表示x不存在於練習1的陣列中，表示x沒有任兩個相同的數
			{
				String [] temp = intChangeFourString (x) ;			//將X值轉為四位數的字串
				String num1000 = temp[0] ;							//將產生的陣列[0](千位數)，給予變數a
				String num100  = temp[1] ;							//將產生的陣列[1](百位數)，給予變數b
				String num10   = temp[2] ;							//將產生的陣列[2](十位數)，給予變數c
				String num1    = temp[3] ;								//將產生的陣列[3](個位數)，給予變數d
				newArray[counter] = num1000 + num100 + num10 + num1 ;	//counter由0開始，塞入四位數的字串
				counter = counter + 1 ;								//counter每塞入一個四位數的字串，則counter+1
			}
		}
		return newArray ;											//最終會得到練習1陣列所沒有的數的陣列，將此陣列回傳
	}
				
	public static void main ( String [] args )						//準備好三個方法，開始正式產生練習2之解答
	{

		if ( ! (args.length == 3) ) 								//man( String[]args )用來接收使用者輸入的參數，首先判斷使用者是否輸入三個參數
		{
			System.out.println ( "請輸入三個參數" ) ;				//若沒有輸入三個參數，則產生提示訊息
			System.exit(0) ;										//因沒有依規定執行，所以離開程式
			 
		}else if ( ! (args[0].length() == 4) )						//檢查第一個參數是否為4個字元
		{
			System.out.println ( "第一個參數請輸入四位數" ) ;		//若非4個字元則產生提示訊息
			System.exit(0) ;										//因沒有依規定執行，所以離開程式
		}
		
		try	 //因使用者輸入之參數有可能非整數或字串，故這邊設定一個try-catch來做檢查
		{
			//嚐試將使用者之第一個參數轉為數字
			intChangeFourString ( Integer.parseInt(args[0]) ) ;
			
			//嚐試將使用者之第一及第三個參數轉為數字
			Integer.parseInt( args[1] ) ;
			Integer.parseInt( args[2] ) ;
			
		}catch ( Exception e)
		{
			//失敗則產生錯誤訊息並退出程式
			System.out.println ( "第一位參數請輸入4位整數，第二及第三位參數請輸入1位整數" ) ;
			System.exit(0) ;
		}
		
			//將使者輸入之第一參數轉為數字後給予先前設定之方法轉為四個字串的陣列
			String [] argNum1 = intChangeFourString ( Integer.parseInt(args[0]) ) ;
			String num1000 = argNum1[0] ;			//接下來的 num1000 代表第一個參數的千位數字串
			String num100  = argNum1[1] ;			//接下來的 num100 代表第一個參數的百位數字串
			String num10   = argNum1[2] ;			//接下來的 num10 代表第一個參數的十位數字串
			String num1    = argNum1[3] ;			//接下來的 num1 代表第一個參數的個位數字串
		
			//開始兩兩相比較，若其中有兩兩相同則產生提示訊息並離開程試
		if ( num1000.equals(num100) || num1000.equals(num10) || num1000.equals(num1) || num100.equals(num10) || num100.equals(num1) || num10.equals(num1) )
		{
			System.out.println ( "第一位參數之四個數字不能有相同數" ) ;
			System.exit(0) ;
		}
			
			//檢查第二位參數及第三位參數是否為個數，而非十位數以上或為負數，若不符合個數則產生訊息並離開程式
		if ( ! (args[1].length() == 1) || ! (args[2].length() == 1 ) )
		{
			System.out.println ( "第二及第三參數請輸入1位正整數" ) ;
			System.exit(0) ;
		}
		
		//將第二及第三參數轉為數字後相加
		int argNum2 = Integer.parseInt( args[1] ) ;
		int argNum3 = Integer.parseInt( args[2] ) ;
		int total = argNum2 + argNum3 ; 
		
		//若第二及第三參數相加若超過四則產生訊息並離開程式
		if ( ! (total <=4) )
		{
			System.out.println ( "第二及第三參數相加必需小於或等於4" ) ;
			System.exit(0) ;
		}
		
		//建立一個陣列，將先前產生兩兩不得重複的陣列方法代入
		String [] sampleArray = newArray() ;

		//將新陣列逐一讀出
		for ( String arrayNum : sampleArray )
		{
			//將新陣列的值拆解成四個字串，準備與使用者的第一參數進行比較
			String sampleNum1 = arrayNum.substring(0,1) ;
			String sampleNum2 = arrayNum.substring(1,2) ;
			String sampleNum3 = arrayNum.substring(2,3) ;
			String sampleNum4 = arrayNum.substring(3,4) ;
			int counterA = 0 ;								//建立一個計數器，用來計算位置及值均相同的個數共幾個
			int counterB = 0 ;								//建立一個計數器，用來值相同但位置不同的個數共幾個
			
			if ( num1000.equals(sampleNum1) )				//針對位置及值均相同的個數做比較(千位數)
				counterA = counterA + 1 ;					//符合則計數器A加1

			if ( num100.equals(sampleNum2) )				//針對位置及值均相同的個數做比較(百位數)
				counterA = counterA + 1 ;					//符合則計數器A加1

			if ( num10.equals(sampleNum3) )					//針對位置及值均相同的個數做比較(十位數)
				counterA = counterA + 1 ;					//符合則計數器A加1
			
			if ( num1.equals(sampleNum4) )					//針對位置及值均相同的個數做比較(個位數)
				counterA = counterA + 1 ;					//符合則計數器A加1
				
			if ( ! (num1000.equals(sampleNum1)) )			//先確定不符合前面位置及值均相同的規則
			{
				//若值相同但位置不同，則計數器B加1
				if ( num1000.equals(sampleNum2) || num1000.equals(sampleNum3) || num1000.equals(sampleNum4) )
				{
					counterB = counterB + 1 ;
				}	
			}
			
			if ( ! (num100.equals(sampleNum2)) )			//先確定不符合前面位置及值均相同的規則	
			{
				//若值相同但位置不同，則計數器B加1
				if ( num100.equals(sampleNum1) || num100.equals(sampleNum3) || num100.equals(sampleNum4) )
				{
					counterB = counterB + 1 ;
				}
			}
			
			if ( ! (num10.equals(sampleNum3)) )			//先確定不符合前面位置及值均相同的規則	
			{
				//若值相同但位置不同，則計數器B加1
				if ( num10.equals(sampleNum1) || num10.equals(sampleNum2) || num10.equals(sampleNum4) )
				{
					counterB = counterB + 1 ;
				}
			}
			
			if ( ! (num1.equals(sampleNum4)) )			//先確定不符合前面位置及值均相同的規則
			{
				//若值相同但位置不同，則計數器B加1
				if ( num1.equals(sampleNum1) || num1.equals(sampleNum2) || num1.equals(sampleNum3) )
				{
					counterB = counterB + 1 ;
				}
			}
			
			//符合配對方式1至少要超過參數值，且符合配對方式2也至少要超過參數值
			if ( (counterA >= argNum2) && (counterB >= argNum3) )
			{
				//將符合的結果列印出來
				System.out.println ( arrayNum ) ;
			}	
		}
	}
}