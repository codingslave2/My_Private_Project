package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guitarorder")
public class GuitarTypeController {

    private final String[] GUITAR_TYPES = {"Strat", "Tele", "Lp", "Prs"};
    private final String[] PICKUP_TYPES = {"Single", "Humbucker", "P90"};
    private final String[] BODYWOOD_TYPES = {"Ash", "Alder", "Mahogani"};
    private final String[] NECKWOOD_TYPES = {"Maple", "Mahogani"};
    private final String[] FINGERBOARD_TYPES = {"Maple", "Rosewood", "Ebony"};

    @GetMapping("/guitar-types")
    public String[] getGuitarTypes() {
        return GUITAR_TYPES;
    }

    @GetMapping("/pickup-types")
    public String[] getPickupTypes() {
        return PICKUP_TYPES;
    }
    
    @GetMapping("/bodywood")
    public String[] getBodyWood() {
    	return BODYWOOD_TYPES;
    }
    
    @GetMapping("/neckwood")
    public String[] getNeckWood() {
    	return NECKWOOD_TYPES;
    }
    
    @GetMapping("/fingerboard")
    public String[] getFingerBoard() {
    	return FINGERBOARD_TYPES;
    }
}
