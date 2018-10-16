import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float km = scn.nextFloat();
        float mile = km*1.6f;
        System.out.println(Math.round(mile*100.0)/100.0);
    }
}
