package h20141216_sung;

/*練習四
 * 建立一個骰子的類別,可以透過建構式決定其骰子的面數
 * 骰子有一個"擲(roll)"的方法,可以取得擲出的結果
 * 試產生三個骰子,並將三個骰子擲出
 * 依照下列規則顯示出點數
 * 三個骰子中必需有二個骰子點數要相等,則第三個骰子的點數為其所得點數。
 * 若三個骰子中沒有任何二個骰子點數相等,則重擲一次。
 * 顯示出實際點數為何	。
*/

public class Dice {
    
	//建立一個屬性，用來存放骰子的面數
    private int faceNum ;
    
    public Dice ( int faceNum ) {
    	//設定骰子最少面數為2面
    	if ( faceNum < 2 ){
    		this.faceNum = 2 ;
    	}
    	
    	this.faceNum = faceNum ;
    }
    
    public int roll() {
    	//回傳值最小為1
        return (int)( 1 + Math.random() * faceNum) ;
    }
    
    public static void main(String[] args) {
    	//建立三個骰子物件，骰子面數自訂
        Dice d1 = new Dice(2);
        Dice d2 = new Dice(6);
        Dice d3 = new Dice(8);
        
        //建立一個初始值為false的變數，當迴圈結果成立時才會離開
        boolean different = false;  
        do {
        	//三個骰子開始骰
            int n1 = d1.roll();
            int n2 = d2.roll();
            int n3 = d3.roll();
            
            //當第一骰子的值與第二相同，則值為第三骰子
            if (n1 == n2) {
            	System.out.println ("第一個骰子與第二個骰子相同，值為第三骰子：　" + n3 ) ;
                different = false;
            
            //當第一骰子的值與第三相同，則值為第二骰子
            } else if (n1 == n3) {
            	System.out.println ("第一個骰子與第三個骰子相同，值為第二骰子：　" + n2 ) ;
                different = false;
            //當第二骰子的值與第三相同，則值為第一骰子    
            } else if (n2 == n3) {
            	System.out.println ("第二個骰子與第三個骰子相同，值為第一骰子：　" + n1 ) ;
                different = false;
            
            //都不符合的情況下則迴圈繼續
            } else {
            	System.out.println ( "三個骰子皆不相同，重新擲一次 !" ) ;
                different = true;
            }
            
        } while (different);      
    }
}


