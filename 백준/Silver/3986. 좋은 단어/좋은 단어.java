import java.util.Stack;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack<String> stack;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            String str = reader.readLine();
            String[] arr = str.split("");
            
            stack = new Stack<>();
            for (int j = 0; j < str.length(); j++){
                if (stack.empty()) {
                    stack.push(arr[j]);
                }
                else {
                    if (stack.peek().equals(arr[j])) {
                        stack.pop();
                    }
                    else {
                        stack.push(arr[j]);
                    }
                }
            }
            if (stack.empty()) {
                result += 1;
            }
        }
        writer.write(result+"\n");
        writer.flush();
        writer.close();
    }
}