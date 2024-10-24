import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* Task 1 calls
        FourMethods.methodA();
        FourMethods.methodB();
        FourMethods.methodC();
        FourMethods.methodD();
        */

        /*
        // Task 3 calls
        // 3.6 Adding courses
        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Everything Java");

        ArrayList<String> canTeachCourses = new ArrayList<>();
        canTeachCourses.add("Everything Java");

        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Java 1.0");

        ArrayList<String> canTeachCourses1 = new ArrayList<>();
        canTeachCourses1.add("Java 1.0");

        // 3.6 Creating student and teacher

        Student s1 = new Student("Student1", passedCourses);
        Teacher t1 = new Teacher("Teacher1", canTeachCourses);
        Student s2 = new Student("Student2", passedCourses1);
        Teacher t2 = new Teacher("Teacher2", canTeachCourses1);

        // 3.6 Adding students and teachers to persons arrayList
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(t1);
        persons.add(s2);
        persons.add(t2);

        // 3.7
        for (Person person : persons) {
            if (person instanceof Student student) {
                if (student.getPassedCourses().contains("Java 1.0")) {
                    System.out.println(student.getName() + " Has already passed this course ");
                } else {
                    System.out.println(student.getName() + " Has not passed this course ");
                }
            }

            if (person instanceof Teacher teacher) {
                if (teacher.getCanTeach().contains("Java 1.0")) {
                    System.out.println(teacher.getName() + " Capable of teaching this course ");
                } else {
                    System.out.println(teacher.getName() + " Unable to teach this course");
                }
            }

        */

        // Task 4 calls
        Shape circle = new Circle(5.0);
        Shape square = new Square(5.0);

        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Area of rectangle: " + square.getArea());

        ShapeBuilder.addShape(circle);
        ShapeBuilder.addShape(square);

        System.out.println("Total area of objects. " + ShapeBuilder.getTotalArea());

    }
}
