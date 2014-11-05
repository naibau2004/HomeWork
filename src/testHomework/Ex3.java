package testHomework;

public class Ex3 
{
	//建立一個方法，有2個參數，第一個參數(numMax)=亂數最大值，第二個參數(randomNum)=產生的個數，會回傳一個int陣列
		public static int [] myRandomFun ( int numMax , int randomNum )
		{
			if ( numMax == 1 )				//若最大數為1，則直接回傳一個陣列只有1的值，不做其他判斷
			{
				int [] onlyOne = {1} ;
				return onlyOne ;
			}
			
			if ( numMax < randomNum )		//若最大值小於要取的random數，則回傳一個陣列只有0的值，因為無此解
			{
				int [] onlyOne = {0} ;
				return onlyOne ;
			}
			
			/*	1. 先建立暫存用陣列(tempArray[])，大小為numMax
			 *  2. 建立另一個陣列(myRandomNum[])，大小為randomNum，為最終答案之陣列 
			 * 	3. 將1至numMax的值塞入tempArray[]中
			 * 	4. 從tempArray[]亂數取出一個位址，如tempArray[5]
			 *  5. 將先前亂數取出的tempArray[]位址(tempArray[5])的值放進myRandomNum[]
			 *  6. 將tempArray最大之位址(tempArray[numMax])的值塞入先前亂數取出的位址(此例為tempArray[5])
			 *  7. tempArray陣列縮小一格，重複步驟4-步驟6，這樣直到取得randomNum的數量都不會得到重複數
			 *  
			 *  EX: numMax = 5 ; randomNum = 3
			 *  int tempArray [] = { 1 , 2 , 3 , 4 , 5 }
			 *  random取得位址為tempArray[2]，將tempArray[2]的值(2)取出給予myRandomNum[]
			 *  將陣列最大值之位址的值(此列為5)，塞入剛剛的tempArray[2]中，此時tempArray陣列為：{ 1 , 5 , 3 , 4 , 5 }
			 *  將陣列縮小一格，此時陣列變為{ 1 , 5 , 3 , 4 } ，繼續重複以上步驟
			 */
			
			int [] tempArray = new int [numMax] ;			//建立暫存用陣列，大小為numMax
			int [] myRandomNum = new int [randomNum] ;		//建立另一個陣列，大小為randomNum，為最終答案之陣列 
			
			for ( int x = 1 ; x <= numMax ; x++ )			//將1至numMax的值塞入tempArray[]中
			{
				tempArray[x-1] = x ;
			}
			
			int tempArraySize = tempArray.length ;			//取tempArray的陣列大小
			
			//每取出一個亂數，則tempArray陣列就縮小1格
			for ( int x= 1 ; x <= randomNum ; x++ , tempArraySize--)
			{
				int getNum = (int)( Math.random() * tempArraySize ) ;	//會取得0到tempArraySize的亂數
				myRandomNum[x-1] = tempArray[getNum] ;					//利用剛取得的亂數，藉由樣本陣列取得值，傳送給最終答案之陣列
				tempArray[getNum] = tempArray[tempArraySize-1] ;		//將樣本陣列最大的陣列值(tempArraySize-1)取代剛得到的值
				
			}
			
			return myRandomNum ;										//將結果回傳
		}
		
		public static void main ( String [] args )						//驗證結果
		{
			int [] x = myRandomFun( 6 , 6 ) ;							//給予參數，最大值為6(1-6)，取6個數，可檢查是否會重複
			
			for ( int item : x )										//將取得的陣列逐一列印
			{
				System.out.println ( item ) ;
			}
		}
}
