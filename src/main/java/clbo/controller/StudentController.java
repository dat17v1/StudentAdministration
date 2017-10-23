package clbo.controller;

import clbo.model.entities.Student;
import clbo.model.repositories.IStudentRepository;
import clbo.model.repositories.StudentArrayRepository;
import clbo.model.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by clbo on 06/09/2017.
 */

@Controller
public class StudentController {

    ArrayList<Student> students = new ArrayList<Student>();
    StudentArrayRepository studentRepo = new StudentArrayRepository();

    @Autowired
    IStudentRepository studentRepo2 = new StudentRepository();


    // READ ALL
    @GetMapping("/")
    public String index(Model model) {

        students = studentRepo2.readAll();//studentRepo.readAll();
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

        studentRepo2.create(stu);
        return "redirect:/";
        //return "create";
    }

    // READ
    @GetMapping("/details")
    public String details(@RequestParam("studentId") String studentId, Model model)
    {
        model.addAttribute("stu", studentRepo2.read(Integer.parseInt(studentId)));
        return "details";
    }

    // DELETE
    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") String studentId){
        studentRepo.delete(Integer.parseInt(studentId));
        return "redirect:/";
    }

    // UPDATE
    // LAV en update metode
    @GetMapping("/update")
    public String update(@RequestParam("studentId") String studentId, Model model){
        model.addAttribute("stu", studentRepo.read(Integer.parseInt(studentId)));
        return "update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Student stu)
    {
        studentRepo.update(stu);
        return "redirect:/";
    }




}

