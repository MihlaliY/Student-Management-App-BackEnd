package Student.Management.demo.Services;

import Student.Management.demo.Models.StudentModel;
import Student.Management.demo.Repository.StudentRepo;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    // Repo dependency injection. Final meaning it can't be changeed
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    // add student function
    public StudentModel addStudent(StudentModel studentModel) {
        return studentRepo.save(studentModel);
    }

    // edit/Update
    public StudentModel updateStudent(Long id, StudentModel updatedStudent) {

        StudentModel studentModel = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        studentModel.setStudentName(updatedStudent.getStudentName());
        studentModel.setEmail(updatedStudent.getEmail());

        return studentRepo.save(studentModel);
    }

    // delete student
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
