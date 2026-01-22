package Student.Management.demo.Services;

import Student.Management.demo.Models.PersonModel;
import Student.Management.demo.Repository.PersonRepo;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final PersonRepo personRepo;

    public AuthService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    // Register logic
    public PersonModel register(String name, String email, String password) {

        if (personRepo.findByEmail(email).isPresent()) {
            throw new RuntimeException("User already exists");
        }
//instantiate this because Models cannot be injected like services.
        PersonModel person = new PersonModel();
        person.setUserName(name);
        person.setEmail(email);
        person.setPassword(password);

        return personRepo.save(person);
    }

    // Login logic
    public PersonModel login(String email, String password) {

        PersonModel person = personRepo.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));

        if (!password.equals(person.getPassword())) {
            throw new RuntimeException("Invalid credentials");// Password hashing needed here but I will do research
        }

        return person;
    }
}
