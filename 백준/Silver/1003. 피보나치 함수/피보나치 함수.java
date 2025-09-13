import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();
        int[] zero = new int[41];
        int[] one = new int[41];

        zero[0] = 1; one[0] = 0;
        zero[1] = 0; one[1] = 1;

        for(int i = 2; i < 41; i++) {
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            sb.append(zero[n]).append(' ').append(one[n]).append('\n');
        }

        System.out.print(sb);
        sc.close();
    }
}