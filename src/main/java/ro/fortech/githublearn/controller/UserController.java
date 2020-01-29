package ro.fortech.githublearn.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fortech.githublearn.model.UserModel;
import ro.fortech.githublearn.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public List<UserModel> getAllUsers(){
    return userService.getAllUsers();
  }
}
