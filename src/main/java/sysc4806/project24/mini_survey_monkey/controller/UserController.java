package sysc4806.project24.mini_survey_monkey.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sysc4806.project24.mini_survey_monkey.model.UserMonkey;
import sysc4806.project24.mini_survey_monkey.repository.UserRepository;

@org.springframework.stereotype.Controller
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/create")
    public String showCreateUserForm(){
        return "create-user";
    }
    @PostMapping("/create")
    public String createUser(@RequestParam String name, @RequestParam String email) {
        UserMonkey user = new UserMonkey(name, email);
        userRepository.save(user);
        return "redirect:/user/" + user.getId();
    }


    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable Long id, Model model) {
        UserMonkey user = userRepository.findById(id).orElse(null);
        if (user != null) {
            model.addAttribute("user", user);
            return "user-details";
        }
        return "redirect:/";
    }
}
