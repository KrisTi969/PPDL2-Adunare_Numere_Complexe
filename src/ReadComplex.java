import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by crys_ on 19.10.2017.
 */
public class ReadComplex<T> {
    public void readArrayFromFileComplex(int n, int m, T[][] a, String fileName, T t) throws FileNotFoundException {
        Scanner s = new Scanner(new File(fileName));
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if(t instanceof  ComplexNr)
                    a[i][j] = (T)new ComplexNr(s.nextInt(), s.nextInt());
                else if(t instanceof  Integer)
                    a[i][j] = (T)new Integer(s.nextInt());
                else
                    a[i][j] = (T)new Double(s.nextInt());
                System.out.print( a[i][j].toString() +" | ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
