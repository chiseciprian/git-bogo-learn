package ro.fortech.githublearn.controller;

import java.util.UUID;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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

  @PutMapping
  public UserModel updateUser(@PathVariable UUID id,@RequestBody UserModel newUser){
    return userService.updateUser(id,newUser);
  }
}
