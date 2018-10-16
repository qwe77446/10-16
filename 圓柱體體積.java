import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float r = scn.nextFloat();
        float h = scn.nextFloat();
        double v = Math.PI*r*r*h;
        System.out.println(v);

    }

}
