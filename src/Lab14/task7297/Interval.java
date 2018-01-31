package Lab14.task7297;

/**
 * Created by adm on 31.01.2018.
 */
public class Interval {
    public int a;
    public int b;

    public boolean contains(int x) {

        if (b < a) {
            throw new IllegalStateException("Корректность интервала была нарушена");
        }

        if ((x > a) && (x < b)) {
            return true;
        } else {
            return false;
        }
    }


}
