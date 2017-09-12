package clbo.model.repositories;

import clbo.model.entities.Student;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by clbo on 12/09/2017.
 */
public class StudentArrayRepository implements IStudentRepository {

    // CRUD fra Arraylist
    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public void create(Student st) {
        st.setStudentId("1");
        students.add(st);
    }

    @Override
    public ArrayList<Student> readAll() {
        return students;
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
