package Lab14.task9914;

/**
 * Created by adm on 24.01.2018.
 */
public class Interval {
    public int a;
    public int b;
    public boolean intersects ( Interval r ) {
if (r == null){
    throw new IllegalArgumentException("Данный интервал не инициализирована");
}

        return ((r.a > this.a)&&(r.a < this.b));
    }
}
