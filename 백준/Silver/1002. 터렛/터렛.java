import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cases = new int[6];
        //cases[i] == (x1, y1, r1, x2, y2, r2)
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            for(int j = 0; j < 6; j++) {
                cases[j] = sc.nextInt();
            }
            if (cases[0] == cases[3] && cases[1] == cases[4] && cases[2] == cases[5]) {
                sb.append(-1).append('\n');
            }
            else {
                long dx = cases[0] - cases[3];
                long dy = cases[1] - cases[4];
                long d = dx*dx + dy*dy;
                long rSum = cases[2] + cases[5];
                long rDiff = Math.abs(cases[2] - cases[5]);
                if (d > rSum*rSum || d < rDiff*rDiff)
                    sb.append(0).append('\n');
                else if (d == rSum*rSum || d == rDiff*rDiff)
                    sb.append(1).append('\n');
                else
                    sb.append(2).append('\n');
            }
        }
        sc.close();
        System.out.print(sb);
    }
}
