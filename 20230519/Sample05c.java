import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sample05c {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("test.dat"));

        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            System.out.println(x);
        }

        sc.close();
    }
}
