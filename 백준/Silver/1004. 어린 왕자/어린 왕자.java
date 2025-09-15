import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Circle {
    int cx, cy, r;

    Circle(int cx, int cy, int r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    boolean inside (int x, int y) {
        int dx = x - cx;
        int dy = y - cy;
        return dx*dx + dy*dy < r*r;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            String[] line = br.readLine().split(" ");
            int x1 = Integer.parseInt(line[0]);
            int y1 = Integer.parseInt(line[1]);
            int x2 = Integer.parseInt(line[2]);
            int y2 = Integer.parseInt(line[3]);

            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j = 0; j < n; j++) {
                line = br.readLine().split(" ");
                Circle circle = new Circle(
                        Integer.parseInt(line[0]),
                        Integer.parseInt(line[1]),
                        Integer.parseInt(line[2]));

                boolean startInside = circle.inside(x1, y1);
                boolean endInside = circle.inside(x2, y2);

                if (startInside != endInside) {
                    count++;
                }
            }
            System.out.println(count);
        }
        br.close();
    }
}