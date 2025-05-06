import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int D1 = Integer.parseInt(st.nextToken());
        int D2 = Integer.parseInt(st.nextToken());
        int D3 = Integer.parseInt(st.nextToken());

        int result;

        if (D1 == D2 && D3 == D2) {
            result = 10000 + D1*1000;
        }
        else if (D1 == D2) {
            result = 1000 + D2*100;
        }
        else if (D1 == D3) {
            result = 1000 + D3*100;
        }
        else if (D2 == D3) {
            result = 1000 + D3*100;
        }
        else {
            result = Math.max(Math.max(D1, D2), D3)*100;
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
