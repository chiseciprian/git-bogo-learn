package ro.fortech.githublearn.service;

import java.util.UUID;
import org.springframework.stereotype.Service;
import ro.fortech.githublearn.model.UserModel;
import ro.fortech.githublearn.repository.UserRepository;

@Service
public class UserService {

  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void deleteUser(UUID id){
     userRepository.deleteById(id);
  }
}
