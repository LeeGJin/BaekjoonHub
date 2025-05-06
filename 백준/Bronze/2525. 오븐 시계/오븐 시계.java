import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st1.nextToken());

        H = (H + (M+T) / 60) % 24;
        M = (M+T)%60;

        bw.write(H + " " + M + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
