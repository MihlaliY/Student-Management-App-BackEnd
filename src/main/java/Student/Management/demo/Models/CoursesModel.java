package Student.Management.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//Maps object of this class to postgres table
@Entity

//table name
@Table(name = "Course")

//since data is private we access through getters and setters from the dependency lombok
@Getter
@Setter
public class CoursesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseID;
    private String courseName;
}
