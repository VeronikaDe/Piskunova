package Lab14.task2000;

/**
 * Created by adm on 31.01.2018.
 */
public class Interval {
    public int a;
    public int b;


    public Interval(int a, int b) {

        if ( a > b ) {
            throw new IllegalArgumentException("Некорректный интервал");
        }

        this.a = a;
        this.b = b;
    }

    public String print() {
        return String.format("[%d;%d]", a, b);
    }

    public void slide(int x) {
        a = a+x;
        b = b+x;

    }

    public void squeeze(int y){

        if (a>(b-y)) {
            throw new IllegalArgumentException("Невозможно уменьшить интервал на указанную длину");
        }
        else
            b = b - y;


    }

    public int length (){
        return b-a;
    }
}
