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

    @OneToMany(
            mappedBy = "Person",
            cascade = CascadeType.ALL)
   @JoinColumn(name = "userID")
    private PersonModel person;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseID")
    private CoursesModel courses;
}
