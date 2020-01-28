package ro.fortech.githublearn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @PostMapping
  public UserModel addUser(@RequestBody UserModel userModel){
    return userService.addUser(userModel);
  }
}
