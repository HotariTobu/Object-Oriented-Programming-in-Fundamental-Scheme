// 2023年05月26日

public class Student {
    // 学籍番号
    private int id;
    // 名前
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * 学籍番号を確認する
     * @param st 学生オブジェクト
     * @return 学籍番号が違う場合はtrue、それ以外はfalse
     */
    public boolean checkId(Student st) {
        return id != st.id;
    }

    /**
     * 学籍番号と名前を表示する
     */
    public void who() {
        System.out.println(id + ":" + name);
    }
}
