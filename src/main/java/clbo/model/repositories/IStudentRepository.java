package clbo.model.repositories;
import clbo.model.entities.Student;

import java.util.ArrayList;

/**
 * Created by clbo on 12/09/2017.
 */
public interface IStudentRepository {

    // Create
    public void create(Student st);
    // Read
    public ArrayList<Student> readAll();
    public Student read(int id);

    // Update
    public void update(Student st);

    // Delete
    public void delete(int id);

}
