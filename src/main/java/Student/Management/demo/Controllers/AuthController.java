package Student.Management.demo.Controllers;

import Student.Management.demo.Models.PersonModel;
import Student.Management.demo.Services.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// all the end points will start with this
@RequestMapping("/auth")
public class AuthController {

    //Inject the service
    private final AuthService authService;

    public AuthController (AuthService authService) {
        this.authService = authService;
    }

    //create new person/user

    @PostMapping("/register")
    public PersonModel register(@RequestBody PersonModel person){
        return authService.register(
                person.getUserName(),
                person.getEmail(),
                person.getPassword());
    }// I do not have DTO as yet, I am accessing directly from the model.
    //Have to implement DTO later

    //Login

    @PostMapping("/login")
    public PersonModel login(@RequestBody PersonModel person){
        return authService.login(person.getEmail(), person.getPassword());
    }
}
