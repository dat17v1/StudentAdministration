package clbo.controller;

import clbo.model.entities.Student;
import clbo.model.repositories.IStudentRepository;
import clbo.model.repositories.StudentArrayRepository;
import clbo.model.repositories.StudentRepository;
import clbo.model.repositories.StudentToFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by clbo on 06/09/2017.
 */

@Controller
public class StudentController {

    ArrayList<Student> students = new ArrayList<Student>();
    StudentArrayRepository studentRepo = new StudentArrayRepository();
    /* @Autowired
    JdbcTemplate jdbc; */
    @Autowired
    IStudentRepository studentRepo2 = new StudentRepository();


    // READ ALL
    @GetMapping("/")
    public String index(Model model) {
        studentRepo2.readAll();
        students = studentRepo.readAll();
        model.addAttribute("stu", students);
        return "index";
    }

    // CREATE
    @GetMapping("/create")
    public String create(Model model) {
        //jdbc.execute("insert into students(first_name,last_name, enrollmentdate, cpr)values('ole','Bove', '2010-10-10', '221070-3333')");

       //studentRepo2.create();
        model.addAttribute("student", new Student());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student stu){

        //students.add(stu);

        studentRepo2.create(stu);
        //return "redirect:/";
        return "create";
    }

    // READ
    @GetMapping("/details")
    public String details(@RequestParam("studentId") String studentId, Model model)
    {
        model.addAttribute("stu", studentRepo.read(studentId));
        return "details";
    }

    // DELETE
    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") String studentId){
        studentRepo.delete(studentId);
        return "redirect:/";
    }

    // UPDATE
    // LAV en update metode
    @GetMapping("/update")
    public String update(@RequestParam("studentId") String studentId, Model model){
        model.addAttribute("stu", studentRepo.read(studentId));
        return "update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Student stu)
    {
        studentRepo.update(stu);
        return "redirect:/";
    }




}

