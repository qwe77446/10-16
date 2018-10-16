import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cm = scn.nextInt();
        int kg = scn.nextInt();
        double inc = cm/2.54f;
        double pon = kg/0.454f;
        System.out.println(inc);
        System.out.println(pon);

    }
}
