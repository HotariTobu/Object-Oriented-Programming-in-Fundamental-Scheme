// 2023年05月26日

public class StudentCopy {
    public static Student copy(Student s) {
        int id = s.getId();
        String name = s.getName();

        Student st = new Student(id, name);
        return st;
    }
}
