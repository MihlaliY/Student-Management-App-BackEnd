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
    private Integer studentID;
    private String studentName;
    private String course;
    private String email;

    // One person/admin can add/have many students
    @ManyToOne
    @JoinColumn(name = "personID")
    private PersonModel person;

    // One course can belong to many students
    @ManyToOne
    @JoinColumn(name = "courseID")
    private CoursesModel courses;
}
