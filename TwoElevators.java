import java.util.Scanner;

public class TwoElevators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == 1) {
                System.out.println(1);
            } else {
                int timeA = Math.abs(a-1);
                int timeB = Math.abs(b-c) + Math.abs(c-1);
                if (timeA > timeB) {
                    System.out.println(2);
                } else if (timeA == timeB){
                    System.out.println(3);
                } else {
                    System.out.println(1);
                }
            }
        }
    }
}
