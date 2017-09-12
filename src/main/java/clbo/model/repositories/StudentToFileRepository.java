package clbo.model.repositories;

import clbo.model.entities.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by clbo on 12/09/2017.
 */
public class StudentToFileRepository implements IStudentRepository {


    private ArrayList<Student> stu;
    // CRUD fra text fil
    @Override
    public void create(Student st) {

    }

    @Override
    public ArrayList<Student> readAll() {

        new ArrayList<Student>();
        try {
            Scanner scan = new Scanner(new File("test.txt"));

            while(scan.hasNext())
            {
                stu.add(new Student (scan.next(), scan.next()));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return stu;
    }

    @Override
    public Student read(String id) {
        return null;
    }

    @Override
    public void update(Student st) {

    }

    @Override
    public void delete(String id) {

    }
}
