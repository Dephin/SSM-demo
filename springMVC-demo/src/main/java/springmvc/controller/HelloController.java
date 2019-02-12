package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springmvc.model.UserModel;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/hi")
    public String hi() {
        return "hi";
    }

    @RequestMapping("/path_var/{username}")
    public String pathVariables(@PathVariable("username") String username) {
        System.out.println(username);
        return "hi";
    }

    @RequestMapping("/get_params")
    public String getParams(@RequestParam("username") String username) {
        System.out.println(username);
        return "hi";
    }

    @RequestMapping("/get_params2")
    public String getParams2(
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "password", defaultValue = "123") String password) {
        System.out.println(username);
        System.out.println(password);
        return "hi";
    }

    @RequestMapping("/get_params3")
    public String getParams3(UserModel userModel) {
        System.out.println(userModel.getUsername());
        System.out.println(userModel.getPassword());
        return "hi";
    }

    @RequestMapping(value = "/post_form", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    // springMVC 会自动识别表单提交的变量并装载进 username 和 password中
    @RequestMapping(value = "/post_form", method = RequestMethod.POST)
    public String postForm(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        return "login";
    }

    @RequestMapping(value = "/post_form2", method = RequestMethod.POST)
    public String postForm2(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        return "login";
    }

    @RequestMapping(value = "/post_form3", method = RequestMethod.POST)
    public String postForm3(@ModelAttribute("user") UserModel user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "login";
    }

    @RequestMapping("/display_data")
    public String displayData(Model model) {
        model.addAttribute("item", "Wahhhh");
        return "display";
    }

}
