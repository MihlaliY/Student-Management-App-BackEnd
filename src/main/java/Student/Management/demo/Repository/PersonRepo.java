package Student.Management.demo.Repository;

import Student.Management.demo.Models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepo extends JpaRepository<PersonModel, Long> {
    Optional<PersonModel> findByEmail(String email);

}
