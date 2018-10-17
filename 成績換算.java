import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int score = scn.nextInt();
        int newscore = (int)Math.sqrt((double)score)*10;
        System.out.println(newscore);

    }
}
