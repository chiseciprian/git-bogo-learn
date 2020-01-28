package ro.fortech.githublearn.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import ro.fortech.githublearn.model.UserModel;
import ro.fortech.githublearn.repository.UserRepository;

@Service
public class UserService {

  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<UserModel> getAllUsers() {
    List<UserModel> userList = new ArrayList<>();
    return userList = userRepository.findAll();
  }
}
