import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<t;i++){
            String wrd = sc.nextLine();
            int length = wrd.length();
            if (length > 10) {
                System.out.print(wrd.charAt(0));
                System.out.print(length-2);
                System.out.print(wrd.charAt(length-1));
                System.out.println();
            } else {
                System.out.println(wrd);
            }
        }
    }
}
