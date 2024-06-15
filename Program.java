// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup1 = new StudentGroup();
        StudentGroup studentGroup2 = new StudentGroup();
        StudentGroup studentGroup3 = new StudentGroup();

        Stream stream1 = new Stream();
        Stream stream2 = new Stream();


        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);
        Student ivan = new Student("Ivan", 5);
        Student lena = new Student("Elena", 6);
        Student alexandr = new Student("Alexandr", 7);
        Student petr = new Student("Petr", 8);
        Student maxim = new Student("Maxim", 9);


        studentGroup1.addStudent(van);
        studentGroup2.addStudent(igor);
        studentGroup1.addStudent(alex);
        studentGroup2.addStudent(alexey);
        studentGroup3.addStudent(ivan);
        studentGroup3.addStudent(lena);
        studentGroup1.addStudent(alexandr);
        studentGroup2.addStudent(petr);
        studentGroup2.addStudent(maxim);

        stream1.addGroup(studentGroup1);
        stream2.addGroup(studentGroup2);
        stream1.addGroup(studentGroup3);

       // stream1.addStream(studentGroup1);


        // System.out.println("студенты " + studentGroup.students);
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        System.out.println("group1: ");
        for(Student student: studentGroup1) {
            System.out.print(student + " ");
        }
        System.out.println();
        System.out.println("group2: ");
        for(Student student: studentGroup2) {
            System.out.print(student + " ");
        }
        System.out.println();
        System.out.println("group3: ");
        for(Student student: studentGroup3) {
            System.out.print(student + " ");
        }

        ArrayList<Stream> streams = new ArrayList<>();

        streams.add(stream1);
        streams.add(stream2);
        
        // public int compare(Student o1, Student o2) {
        //     return o1.id - o2.id;
        // }
        // Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // лямда выражение

        Collections.sort(streams, new StreamComparator());


        // for(Stream stream: studentStream){

        // }
    }

}