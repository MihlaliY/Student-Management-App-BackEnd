package Student.Management.demo.Services;

import Student.Management.demo.Repository.PersonRepo;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    //I am injecting the repository because I need my service to talk to the database
    private final PersonRepo personRepo;

    public AuthService(PersonRepo personRepo){
        this.personRepo = personRepo;
    }

    //Register logic
    public String registerUser(PersonRepo personRepo){

        // check if the user registering exists



        return "Registration Successfull";
    };

}
