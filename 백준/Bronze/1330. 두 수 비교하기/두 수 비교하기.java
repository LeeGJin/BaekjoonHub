import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        if (n1 > n2) {
            bw.write(">");
        }
        else if (n1 == n2) {
            bw.write("==");
        }
        else {
            bw.write("<");
        }


        br.close();
        bw.flush();
        bw.close();
    }
}
