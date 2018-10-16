import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float r = scn.nextFloat();
        float h = scn.nextFloat();
        float pi =3.14f;
        double v = r*r*pi*h;
        System.out.println(v);

    }
}
