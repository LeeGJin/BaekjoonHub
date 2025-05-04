import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        String num2_S = br.readLine();
        for (int i = 2; i >= 0; i--) {
            bw.write((num1*(num2_S.charAt(i) - '0')) + "\n");
        }
        bw.write(( num1* (Integer.parseInt(num2_S))) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
