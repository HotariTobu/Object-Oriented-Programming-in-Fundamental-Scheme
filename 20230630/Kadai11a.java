// 2023年06月30日

public class Kadai11a {
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        threads[0] = new Thread(new PrintTask(2000, "Hello"));
        threads[1] = new Thread(new PrintTask(3000, "World"));
        threads[2] = new Thread(new PrintTask(4000, "New"));

        for (Thread thread : threads) {
            thread.start();
        }
    }
}

/* 実行結果 ********************************************************
Hello
New
World
Hello
World
New
Hello
World
New
*******************************************************************/

/* 実行結果 ********************************************************
Hello
New
World
Hello
World
New
Hello
World
New
*******************************************************************/

/* 実行結果 ********************************************************
Hello
World
New
Hello
World
Hello
New
World
New
*******************************************************************/

/* 実行結果 ********************************************************
Hello
New
World
Hello
World
New
Hello
World
New
*******************************************************************/
