import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float L = scn.nextFloat();
        float G = L*0.26418f;
        System.out.println(Math.round(G*10.0)/10.0);

    }
}
