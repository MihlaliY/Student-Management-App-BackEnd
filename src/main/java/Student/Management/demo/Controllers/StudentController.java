package Student.Management.demo.Controllers;

import Student.Management.demo.Models.StudentModel;
import Student.Management.demo.Repository.StudentRepo;
import Student.Management.demo.Services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //add/create student
    @PostMapping("/students")
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
    public void deleteStudent(Long id){
        studentService.deleteStudent(id);
    }


}
