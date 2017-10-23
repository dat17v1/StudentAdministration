package clbo.model.repositories;

import clbo.model.entities.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by clbo on 12/09/2017.
 */
@Repository
public class StudentRepository implements IStudentRepository {

    @Autowired
    private JdbcTemplate jdbc;
    private ArrayList<Student> students;
    private SqlRowSet rs;

    public StudentRepository() {
        students = new ArrayList<Student>();
    }

    public void create(Student st) {
        jdbc.update("insert into students(first_name,last_name, enrollmentdate, cpr)values('Claus666','Bove', '2010-10-10', '221070-3333')");
    }

    public ArrayList<Student> readAll() {

        students.clear();
        rs = jdbc.queryForRowSet("select * from students");
        while (rs.next()) {

            students.add(new Student(rs.getInt("student_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getDate("enrollmentdate"),
                    rs.getString("cpr")));

        }
        return students;
    }


    public Student read(int id) {
       // Student student = jdbc.queryForObject("SELECT * FROM students where student_id =" + id + "", Student.class);
       // System.out.println(student.toString());

        rs = jdbc.queryForRowSet("SELECT * FROM students where student_id ='" + id + "'");
        while (rs.next()) {

            return  new Student(rs.getInt("student_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getDate("enrollmentdate"),
                    rs.getString("cpr"));

        }

        return new Student();
    }


    public void update(Student st) {
        // TODO: return type bool
        int result = jdbc.update("UPDATE students SET " +
                "first_name ='"+ st.getFirstName() +"' , " +
                "last_name='"+ st.getLastName() +"' ," +
                "enrollmentdate='"+ st.getEnrollmentDate() +"' ," +
                "cpr='"+ st.getCpr() +"' WHERE student_id = '"+ st.getStudentId() +"'");
    }


    public void delete(int id) {
        // TODO: return type bool
        int result = jdbc.update("DELETE FROM students WHERE student_id='" + id + "'");

    }


}
