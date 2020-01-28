package ro.fortech.githublearn.service;

import org.springframework.stereotype.Service;
import ro.fortech.githublearn.repository.UserRepository;

@Service
public class UserService {

  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }
}
