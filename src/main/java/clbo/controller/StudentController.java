package clbo.controller;

import clbo.model.entities.Student;
import clbo.model.repositories.IStudentRepository;
import clbo.model.repositories.StudentArrayRepository;
import clbo.model.repositories.StudentToFileRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by clbo on 06/09/2017.
 */

@Controller
public class StudentController {

    ArrayList<Student> students;

    StudentArrayRepository studentRepo = new StudentArrayRepository();

    Object student = new Student();

    @GetMapping("/")
    public String index(Model model) {

        Integer xxx = 666;
        String xxxx = xxx.toString();

        //model.addAttribute("intnavn", xxx);

        students = studentRepo.readAll();
        model.addAttribute("stu", students);
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("student", new Student());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student stu){

        //students.add(stu);

        studentRepo.create(stu);
        return "create";
    }
}



// add one student to arraylist.
// Here it is hard coded. Later we will add this dynamically
//String index = Integer.toString(students.size() + 1);