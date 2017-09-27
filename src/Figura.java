import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public abstract class Figura implements Comparable<Figura> {

    public abstract double area();//la extensió depen de las classes inferiors

    public int compareTo(Figura other) {
        double comp = (this.area() - other.area());
        if (comp > 0) {
            return 1;
        }
        if (comp < 0) {
            return -1;
        }
        System.out.print("El resultado de la comparacion es " + comp + " ");
        return 0;
    }

}
