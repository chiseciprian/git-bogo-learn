package ro.fortech.githublearn.controller;

import java.util.UUID;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fortech.githublearn.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @DeleteMapping
  public void deleteUser(@PathVariable UUID id){
    userService.deleteUser(id);
  }
}
