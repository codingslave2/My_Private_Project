package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/form")
public class GuitarController {

    @GetMapping("/RegisterForm")
    public String showGuitarTypes(Model model) {

        List<String> guitarTypes = List.of("스트라토캐스터", "텔레캐스터", "재즈마스터", "재규어", "레스폴",
                "Prs", "슈퍼스트랫", "헤비쉐입", "할로우바디", "그 외");
        model.addAttribute("guitarTypes", guitarTypes);

        return "RegisterForm";

    }

}
