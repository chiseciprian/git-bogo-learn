package ro.fortech.githublearn.repository;


import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ro.fortech.githublearn.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

  UserModel findUserModelById(UUID id);

}
