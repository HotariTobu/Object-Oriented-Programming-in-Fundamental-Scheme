// 2023年06月30日

package pa2;

import java.util.InputMismatchException;
import java.util.Scanner;

import pa.Triangle;
import pa.TriangleException;

public class Kadai11e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t = null;

        while (t == null) {
            try {
                System.out.print("a: ");
                double a = sc.nextDouble();
                System.out.print("b: ");
                double b = sc.nextDouble();
                System.out.print("c: ");
                double c = sc.nextDouble();

                t = new Triangle(a, b, c);
            }
            catch (TriangleException e) {
                System.err.println(e);
            }
            catch (InputMismatchException e) {
                System.out.println(e);
                sc.next();
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("面積：" + t.area());

        sc.close();
    }
}

/* 実行結果 ********************************************************
java pa2.Kadai11e
a: g
java.util.InputMismatchException
a: 1
b: 2
c: 3
例外処理：三角形にならない三辺です
a: 3
b: 4
c: 1
例外処理：三角形にならない三辺です
a: 1.2
b: 1.6
c: 2.0
面積：0.9599999999999997
*******************************************************************/
