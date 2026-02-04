import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Student(sc.nextInt(), sc.next(), sc.nextDouble()));
        }

        Collections.sort(list, (a, b) -> {
            if (Double.compare(b.cgpa, a.cgpa) != 0)
                return Double.compare(b.cgpa, a.cgpa);
            if (!a.name.equals(b.name))
                return a.name.compareTo(b.name);
            return a.id - b.id;
        });

        for (Student s : list) {
            System.out.println(s.name);
        }
    }
}
