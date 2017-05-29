
package foods;

import framework.Food;

/**
 *
 * @author c16311
 */
public class Sushi extends Food{
    
   protected String owner;
    //private static int ownerNum=1000000;
    public Sushi(String owner){
        System.out.println(owner+"が追加されました。");
        this.owner = owner;
    }
    @Override
    public void order(int num){
        System.out.println(owner+(num)+"皿の注文が入りました。");
    }
    public String getOwner(){
        return owner;
    }
    
}
