import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<t;i++){
            String inp = sc.nextLine();
            String check = inp.toLowerCase();
            if (check.equals("yes")){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
