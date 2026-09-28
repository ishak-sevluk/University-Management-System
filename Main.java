import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student = new Student(
                UUID.randomUUID(),
                "230504054",
                "10199561732",
                "ishak",
                "Sevluk",
                null,
                Gender.MALE,
                "230504054@st.atlas.edu.tr",
                "05468986202",
                "Istanbul",
                null,
                2023,
                2,
                StudentStatus.ACTIVE,
                null,
                null
        );

        students.add(student);

        System.out.println("Registered Students:");

        for (Student registeredStudent : students) {
            System.out.println(registeredStudent);
        }
    }
}
