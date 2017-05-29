
import framework.*;
import foods.*;

/**
 *
 * @author c16311
 */
public class Main2 {
    public static void main(String[] args){
        Maker maker1 = new Shokunin();
        Maker maker2 = new Patissier();
        System.out.println();
        
        Food hotate = maker1.cook("マグロ");
        Food maguro = maker1.cook("ホタテ");
        Food mont_blanc = maker2.cook("モンブラン");
        Food short_cake = maker2.cook("ショートケーキ");
        System.out.println();
        
        hotate.order(2);
        maguro.order(4);
        mont_blanc.order(3);
        short_cake.order(1);
        
    }
}
