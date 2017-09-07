package clbo.controller;

import clbo.model.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by clbo on 07/09/2017.
 */

@Controller
public class StudentController {

    ArrayList<Student> students = new ArrayList<Student>();

    @GetMapping("/")
    public String index(Model model) {

        students.add(new Student("1", "Claus", "Bove", new Date(10, 12, 01), "221070-9999"));

        model.addAttribute("stu", students);
        return "index";
    }
}
