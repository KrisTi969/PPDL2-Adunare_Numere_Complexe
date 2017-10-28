/**
 * Created by crys_ on 16.10.2017.
 */
public class MSumThread extends Thread {
    protected Matrice matrice1, matrice2, matrice3;
    protected int iStart, jStart, iStop, jStop;

    public MSumThread(Matrice matrice1, Matrice matrice2, Matrice matrice3,
                      int iStart, int iStop, int jStart, int jStop) {
        this.matrice1 = matrice1;
        this.matrice2 = matrice2;
        this.matrice3 = matrice3;
        this.iStart = iStart;
        this.iStop = iStop;
        this.jStart = jStart;
        this.jStop = jStop;
        System.out.println(getName()+" "+iStart+" "+iStop+" "+jStart+" "+jStop);
    }

    @Override
    public void run() {
        Integer iStartLocal = iStart;
        Integer iStopLocal = iStop;
        Add<Object> addOperator = new Add<>();
        if (jStart > 0) {
            iStartLocal ++;
            for (int i = jStart; i < matrice1.getNrColoane(); i++) {
                matrice3.getMatrice()[i][jStart] = addOperator.apply(matrice1.getMatrice()[i][jStart], matrice2.getMatrice()[i][jStart]);
            }
        }
        if (jStop < matrice1.getNrColoane()) {
            iStopLocal --;
            for (int i = 0; i < jStop; i++) {
                //matrice3.setMatrice(iStop, i, matrice1.getMatrice()[iStart][i] + matrice2.getMatrice()[iStart][i]);
                matrice3.getMatrice()[iStop][i] = addOperator.apply(matrice1.getMatrice()[iStart][i], matrice2.getMatrice()[iStart][i]);
            }
        }
        for (int i = iStart; i <= iStopLocal; i++) {
            for (int j = 0; j < matrice1.getNrColoane(); j++) {
               // matrice3.setMatrice(i, j, matrice1.getMatrice()[i][j] + matrice2.getMatrice()[i][j]);
                matrice3.getMatrice()[i][j] = addOperator.apply(matrice1.getMatrice()[i][j], matrice2.getMatrice()[i][j]);
            }
        }

        /*Integer iStartLocal = iStart;
        Integer iStopLocal = iStop;
        Add<Object> addOperator = new Add<>();
        if (jStart > 0) {
            iStartLocal ++;
            for (int i = jStart; i < matrice1.getNrColoane(); i++) {
                matrice3.setMatrice(iStart, i, matrice1.getMatrice()[iStart][i] + matrice2.getMatrice()[iStart][i]);
            }
        }
        if (jStop < matrice1.getNrColoane()) {
            iStopLocal --;
            for (int i = 0; i < jStop; i++) {
                matrice3.setMatrice(iStop, i, matrice1.getMatrice()[iStart][i] + matrice2.getMatrice()[iStart][i]);
            }
        }
        for (int i = iStart; i <= iStopLocal; i++) {
            for (int j = 0; j < matrice1.getNrColoane(); j++) {
                matrice3.setMatrice(i, j, matrice1.getMatrice()[i][j] + matrice2.getMatrice()[i][j]);
            }
        }*/
    }
}
