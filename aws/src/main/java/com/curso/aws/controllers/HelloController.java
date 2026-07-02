import org.springframework.stereotype.Controller;

@Controller
@GetMapping("/")
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
