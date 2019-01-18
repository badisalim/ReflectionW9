package W9_reflection;

import W4_9FileReader.FileReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSummarizer {


    private static FileReader reader = new FileReader();
    private static List<String> students = reader.asLines("W9_reflection/students-performance.csv");

    public static void main(String[] args) {


        System.out.println(students);
    }

    private static int numberOfStudent() {
        return filterMethod().stream()
                .sorted(Comparator.comparing(Student::getGender))
                .limit(10)
                .collect(Collectors.toList()).size();
        //System.out.println(students.size());

    }
        private static List<Student> filterMethod() {
            List<String> students = StudentSummarizer.students;
            return students.stream()
                    .skip(1)
                    .map(e -> e.split(";"))
                    .map(e -> new Student(
                            e[0],
                            e[1],
                            Integer.valueOf(e[2])
                            , Integer.valueOf(e[3])
                            , Integer.valueOf(e[4])))
                    .collect(Collectors.toList());
        }

    }



