import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++){
            String op = sc.nextLine();
            if (op.contains("++")){
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}
