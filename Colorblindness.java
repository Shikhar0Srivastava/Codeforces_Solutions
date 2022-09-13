import java.util.Scanner;

public class Colorblindness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        String ans="Yes";
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            sc.nextLine();
            String row1=sc.nextLine();
            String row2=sc.nextLine();
//            System.out.println(row1);
            if (row1.equals(row2)){
                ans="yes";
            } else{
                for (int j=0;j<n;j++){
                    if (((row1.charAt(j)=='G' && row2.charAt(j)=='B') || (row1.charAt(j)=='B' && row2.charAt(j)=='G'))){
                        ans="yes";
                    }
                    if (((row1.charAt(j)=='R' && row2.charAt(j)=='B') || (row1.charAt(j)=='R' && row2.charAt(j)=='G')) || ((row1.charAt(j)=='B' && row2.charAt(j)=='R') || (row1.charAt(j)=='G' && row2.charAt(j)=='R'))) {
                        ans="no";
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}