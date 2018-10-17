import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();
        int sex = scn.nextInt();
        float w;
        if(sex == 1){
            w = (height-80)*0.7f;
        }
        else{
        w = (height-70)*0.6f;
        }
        System.out.println(w);
    }
}
