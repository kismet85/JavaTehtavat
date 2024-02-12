package Serializable;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "John Doe", 20);
        Course course = new Course("CS101", "Introduction to Computer Science", "Prof. Smith");
        Enrollment enrollment = new Enrollment(student, course, "2024-02-10");

        serializeEnrollment(enrollment, "enrollments.ser");

        Enrollment deserializedEnrollment = deserializeEnrollment("enrollments.ser");
        System.out.println("Deserialized Enrollment:");
        System.out.println(deserializedEnrollment);
    }

    private static void serializeEnrollment(Enrollment enrollment, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(enrollment);
            System.out.println("Enrollment serialized and saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Enrollment deserializeEnrollment(String filename) {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            Enrollment enrollment = (Enrollment) objectIn.readObject();
            System.out.println("Enrollment deserialized from " + filename);
            return enrollment;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
