import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float g = scn.nextFloat();
        float cg = g/600f;
        System.out.println(Math.round(cg*10.0)/10.0);

    }
}
