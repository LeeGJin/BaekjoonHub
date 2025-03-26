import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop();
            }
            else {
                stack.push(num);
            }
        }

        while (!stack.empty()) {
            result += stack.pop();
        }

        bw.write(result + "");
        /*버퍼출력은 int를 출력할 때 해당 정수의 아스키코드를 출력한다.
        *떄문에 정수를 출력하려면 String으로 변환시켜야 한다.
        *아마 저렇게 ""를 붙여도 String형으로 인식하는 듯 하다.
        */
        bw.flush();
        bw.close();
    }

}
