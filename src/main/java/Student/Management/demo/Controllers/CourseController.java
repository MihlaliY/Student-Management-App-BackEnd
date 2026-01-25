package Student.Management.demo.Controllers;

import Student.Management.demo.Services.CourseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CourseController {

    public final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<String> getAllCourses(){
        return courseService.getAllCourses();
    }
}
