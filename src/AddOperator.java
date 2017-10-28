import java.util.function.BinaryOperator;

/**
 * Created by crys_ on 19.10.2017.
 */
public class AddOperator<T extends Number> implements BinaryOperator<T> {
    public T apply(T x, T y) {
        if(x instanceof Integer)
            return (T) new Integer(x.intValue() + y.intValue());
        else
            return (T) new Double(x.doubleValue() + y.doubleValue());
    }
}
