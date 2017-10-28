import java.util.function.BinaryOperator;

/**
 * Created by crys_ on 19.10.2017.
 */

public class Add<T> implements BinaryOperator<T> {
    public T apply(T x, T y) {
        AddOperator addOperator = new AddOperator();
        if (x instanceof Number)
            return (T) addOperator.apply((Number) x, (Number) y);
        else {
            ComplexNr a = (ComplexNr) x;
            ComplexNr b = (ComplexNr) y;
            a.add(b);
            return (T) a;
        }
    }
}
