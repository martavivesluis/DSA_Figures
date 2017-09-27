import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Main {
    public static ArrayList<Figura> misfiguras = new ArrayList<Figura>();

    public static void suma(ArrayList<Figura> misfigura) {
        double total = 0;
        for (Figura figurita : misfigura) {
            System.out.print(figurita.area() + " ");
            total = total + figurita.area();

        }
        System.out.print("El total de les àreas ès " + total + " ");
    }
    public static void ordenar(ArrayList<Figura> misfigura)
    {
        Figura[] miarray = new Figura[misfigura.size()];
        miarray= misfigura.toArray(miarray);
        Arrays.sort(miarray);
        System.out.print("Ordenades de menor a major: ");
        for(Figura figurita : miarray) {
            System.out.print(figurita.area() + " ");
        }
    }

    public static void main(String[] args) {
        double total = 0;
        Figura micirculo = new cercle(4.3);
        Figura micuadrado2 = new Quadrat(2);
        Figura mirectangulo = new Rectangle(3.5, 4.7);
        Figura micuadrado = new Quadrat(6.7);
        misfiguras.add(micirculo);
        misfiguras.add(mirectangulo);
        misfiguras.add(micuadrado2);
        misfiguras.add(micuadrado);
        System.out.println("calculem el àrea de totes les figures anteriors");
        suma(misfiguras);
        int comp = mirectangulo.compareTo(micuadrado);
        System.out.print("El resultado de la comparacion es " + comp + " ");
        ordenar(misfiguras);
    }
}

