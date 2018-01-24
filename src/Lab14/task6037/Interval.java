package Lab14.task6037;

/**
 * Created by adm on 24.01.2018.
 */
public class Interval {
    public int a;
    public int b;
    public static boolean hasIntersection ( Interval l, Interval r) {
        if ( r == null){
                throw new IllegalArgumentException("Данный интервал не инициализирована");
            }
        if ( l == null){
            throw new IllegalArgumentException("Данный интервал не инициализирована");
        }
        if (( r.a > r.b)|| (l.a > l.b)) {
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        return ((r.a > l.a)&&(r.a < l.b));
    }
}
