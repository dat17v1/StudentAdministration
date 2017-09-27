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




    public void create() {
        jdbc.execute("insert into students(first_name,last_name, enrollmentdate, cpr)values('Troels666','Bent', '2010-10-10', '221070-3333')");
    }

    public void create(Student st) {
        jdbc.execute("insert into students(first_name,last_name, enrollmentdate, cpr)values('Claus666','Bove', '2010-10-10', '221070-3333')");
    }


    public ArrayList<Student> readAll() {

        rs = jdbc.queryForRowSet("select * from students");
        while (rs.next()) {

            System.out.println(rs.getInt("student_id") + " " +
                    rs.getString("first_name") + " " +
                    rs.getString("last_name") + " " +
                    rs.getDate("enrollmentdate") + " " +
                    rs.getString("cpr"));

            students.add(new Student(Integer.toString(rs.getInt("student_id")),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getDate("enrollmentdate"),
                    rs.getString("cpr")));

        }
        return students;
    }


    public Student read(String id) {
        return null;
    }


    public void update(Student st) {

    }


    public void delete(String id) {

    }


}
