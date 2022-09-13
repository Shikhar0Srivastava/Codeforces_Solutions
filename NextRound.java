import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int[] inp = new int[n];
        for (int i=0;i<n;i++){
            inp[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if (inp[i]>=inp[k-1] && inp[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
