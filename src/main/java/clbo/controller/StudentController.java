package clbo.controller;

import clbo.model.entities.Student;
import clbo.model.repositories.IStudentRepository;
import clbo.model.repositories.StudentArrayRepository;
import clbo.model.repositories.StudentToFileRepository;
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
   // IStudentRepository studentRepo = new StudentArrayRepository();

    // READ ALL
    @GetMapping("/")
    public String index(Model model) {
        students = studentRepo.readAll();
        model.addAttribute("stu", students);
        return "index";
    }

    // CREATE
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("student", new Student());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student stu){

        //students.add(stu);

        studentRepo.create(stu);
        return "redirect:/";
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

