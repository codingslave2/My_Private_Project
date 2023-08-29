package Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views")
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@GetMapping("/main")
	public String responseMain() {
		logger.info("메인으로 이동");
		return "main"; // 메인 화면으로 이동
	}

	@GetMapping("/order/guitarorder")
	public String responseGuitarOrder() {
		logger.info("기타 주문으로 이동");
		return "guitarorder";
	}

	@GetMapping("/contact")
	public String responseContact() {
		logger.info("연락처로 이동");
		return "contact";
	}

	@GetMapping("/register")
    public String responseRegister() {
		logger.info("회원 가입 페이지로 이동");
		return "registerForm";
	}
}
