package ro.fortech.githublearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fortech.githublearn.model.UserModel;
import ro.fortech.githublearn.repository.UserRepository;

@SpringBootApplication
public class GithublearnApplication {

  public static void main(String[] args) {
    SpringApplication.run(GithublearnApplication.class, args);
  }

  @Bean
  CommandLineRunner atStartup(UserRepository repo) {
    return args -> {
      repo.save(new UserModel("Jane", "Doe"));
      repo.save(new UserModel("Bogosel", "Daniel"));
    };
  }

}
