package Student.Management.demo.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Student")
@Getter
@Setter
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;
    private String studentName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "personID")
    private PersonModel person;

    @ManyToOne
    @JoinColumn(name = "courseID")
    private CoursesModel courses;
}
