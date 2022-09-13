import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0;
        int column = 0;
        int r = 0;
        int cl = 0;
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            if (a == 1) {
                column = 1;
                row = i + 1;
                r = row;
                cl = column;
            } else if (b == 1) {
                column = 2;
                row = i + 1;
                r = row;
                cl = column;
            } else if (c == 1) {
                column = 3;
                row = i + 1;
                r = row;
                cl = column;
            } else if (d == 1) {
                column = 4;
                row = i + 1;
                r = row;
                cl = column;
            } else if (e == 1) {
                column = 5;
                row = i + 1;
                r = row;
                cl = column;
            }
        }
        int distance = Math.abs(r-3) + Math.abs(cl-3);
        System.out.println(distance);
    }
}
