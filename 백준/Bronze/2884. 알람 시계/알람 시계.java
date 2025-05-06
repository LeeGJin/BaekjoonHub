import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if ((M-45) < 0) {
            if (H == 0) {
                H = 24;
            }
            H = H - 1;
            M = (M - 45) + 60;
        }
        else {
            M = M - 45;
        }
        bw.write(H + " " + M);
        bw.flush();
        bw.close();
        br.close();
    }
}
