package Student.Management.demo.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//This will map the object to postgres creating the table
@Entity
@Table(name = "person")

//Get the getters and setters from lombok dependencies (to access all the private variables (ENCAPSULATION))
@Getter
@Setter
public class PersonModel {
    //Primary key for the table
    @Id
    //The ID here will be generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;
    private String userName;
    private String email;
    private String password;

    @OneToMany(mappedBy = "person")
    Set<StudentModel> students = new HashSet<>();
}
