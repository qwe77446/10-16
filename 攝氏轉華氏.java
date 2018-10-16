import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float C = scn.nextFloat();
        float F = C*9/5f+32;
        System.out.println(F);

    }
}
