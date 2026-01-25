package Student.Management.demo.Controllers;

import Student.Management.demo.Models.StudentModel;

import Student.Management.demo.Services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //Read all the students
    @GetMapping
    public List<StudentModel> getStudents(){
        return studentService.getAllStudents();
    }
    //add/create student
    @PostMapping
    public StudentModel addStudent(@RequestBody StudentModel studentModel) {
        return studentService.addStudent(studentModel);
    }

    //edit / update student
    @PutMapping("/{id}")
    public StudentModel updateStudent (@PathVariable Long id, @RequestBody StudentModel studentModel){
        return studentService.updateStudent(id, studentModel);
    }

    // delete specific student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }


}
