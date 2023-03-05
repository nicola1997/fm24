import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static int anno=2023;

    public static void main(String[] args) {

        ArrayList<Stadio> stadi= new ArrayList<>();
        stadi.add(new Stadio("Olimpico",90000,30,3));

        Squadra s = new Squadra("Inter",stadi.get(0));
        System.out.println(s);
    }
}