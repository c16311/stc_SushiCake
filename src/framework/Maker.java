
package framework;

/**
 *
 * @author c16311
 */
public abstract class Maker {
    public final Food cook(String owner){
        Food p = cookFood(owner);
        risterFood(p);
        return p;
    }
    protected abstract Food cookFood(String owner);
    protected abstract void risterFood(Food food);
}
