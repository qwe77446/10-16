import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Chinese = scn.nextInt();
        int English = scn.nextInt();
        int Math = scn.nextInt();
        int sum = Chinese+English+Math;
        int avg = sum/3;
        System.out.println(sum);
        System.out.println(avg);

    }
}
