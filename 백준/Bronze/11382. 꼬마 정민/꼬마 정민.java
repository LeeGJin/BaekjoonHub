import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //int형 변수를 선언했다가 런타임 에러가 걸려 확인해보니 각 수의 최대가 10^12였다. int형으로는 
        //해당 수를 표현할 수 없으니 에러가 발생하였던 것이다. 때문에 9.2*10^18 까지 표현가능한 long으로
        //바꿨다.
        long n1 = Long.parseLong(st.nextToken());
        long n2 = Long.parseLong(st.nextToken());
        long n3 = Long.parseLong(st.nextToken());
        
        bw.write((n1+n2+n3) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
