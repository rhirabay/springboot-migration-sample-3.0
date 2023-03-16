package rhirabay.springbootmigrationsample30;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.Max;

@RestController
public class SampleController {
    @GetMapping({"/sample", "/hello"})
    public String hello(
            @RequestParam @Max(100) int num
    ) {
        return "hello";
    }
}
