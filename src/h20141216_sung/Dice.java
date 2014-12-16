package h20141216_sung;

import java.util.Arrays;
import java.util.List;

/*
 * 版權宣告: FDC all rights reserved.
 */

/**
 * 程式資訊摘要：<P>
 * 類別名稱　　：Dice.java<P>
 * 程式內容說明：<P>
 * 程式修改記錄：<P>
 * XXXX-XX-XX：<P>
 *@author chtd
 *@version 1.0
 *@since 1.0
 */
public class Dice {
    
    private List<Integer> points;
    
    public Dice () {
        points = Arrays.asList(1, 2, 3, 4, 5, 6);
    }
    
    public int roll() {
        return points.get((int)(Math.random() * 6));
    }
    
    
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();
        
        boolean different = false;
        
        do {
            int n1 = d1.roll();
            int n2 = d2.roll();
            int n3 = d3.roll();
            
            if (n1 == n2) {
                System.out.println(n3);
                different = false;
            } else if (n1 == n3) {
                System.out.println(n2);
                different = false;
            } else if (n2 == n3) {
                System.out.println(n2);
                different = false;
            } else {
                different = true;
            }
            
        } while (different);
        
    }

}



