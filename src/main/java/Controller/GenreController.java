package Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/genre")
public class GenreController {

    @GetMapping("/genre")
	public String showGenre(Model model) {
		
        List<String> genres = List.of("락", "팝", "재즈", "클래식", "힙합", "메탈", "CCM", "기타");
        model.addAttribute("genres", genres);
        return "registerForm"; // RegisterForm.html을 반환
		
	}
	
}
