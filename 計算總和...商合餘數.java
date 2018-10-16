import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int sum=a+b;
        int dif=a-b;
        int g=a*b;
        int D=a/b;
        int E=a%b;
        System.out.println(a+"+"+b+"="+sum);
        System.out.println(a+"-"+b+"="+dif);
        System.out.println(a+"*"+b+"="+g);
        System.out.println(a+"/"+b+"="+D+"..."+E);

    }
}
