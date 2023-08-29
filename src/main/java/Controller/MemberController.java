package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @PostMapping("/register")
    public String register(User user, @RequestParam String action) {

        if ("회원 가입".equals(action)) {
            // 회원 가입 로직
            // 예: 데이터베이스에 사용자 정보 저장
        } else if ("취소".equals(action)) {
            // 취소 버튼 클릭 시 로직
            return "redirect:/main";       }

        return "registerForm";
    }

}
