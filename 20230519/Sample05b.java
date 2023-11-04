import java.util.Scanner;

public class Sample05b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            System.out.println(x);
        }

        sc.close();
    }
}
