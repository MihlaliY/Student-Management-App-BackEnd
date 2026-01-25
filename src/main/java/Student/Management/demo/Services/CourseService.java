package Student.Management.demo.Services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    public List<String> getAllCourses(){
        return List.of("Maths", "English", "LO", "PHYSICS", "LIFE SCIENCES");
    }
}
