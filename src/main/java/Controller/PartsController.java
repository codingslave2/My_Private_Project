package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guitarorder")
public class PartsController {
	
	private final String[] VOLUMEKNOB_TYPE = {};	
	private final String[] SWITCH_TYPE = {"3ways", "5ways"};
	private final String[] TUNER = {"6inarow", "3X3"};
	private final String[] PICKGUARD_TYPE = {};
	// 튠오토 - 레스폴, 트레몰로 - 스트랫, 하드테일 - 텔레, 랩어라운드 - prs
	private final String[] BRIDGE_TYPE = {"tuneomatic", "tremolo", "floyd", "hardtail", "bigsby", "wraparound"};	
	private final String[] CAPACITOR = {"22nF", "47nF", "33nF"};
	private final String[] CABLE_TYPE = {"vintage", "modern"};
	
	
    @GetMapping("/volumeknob-type")
    public String[] getVolumeknobType() {
        return VOLUMEKNOB_TYPE;
    }
    
    @GetMapping("/switch-type")
    public String[] getSwitchType() {
        return SWITCH_TYPE;
    }

    @GetMapping("/tuner")
    public String[] getTunerTypes() {
        return TUNER;
    }

    @GetMapping("/pickguard-type")
    public String[] getPickguardTypes() {
        return PICKGUARD_TYPE;
    }

    @GetMapping("/bridge-type")
    public String[] getBridgeTypes() {
        return BRIDGE_TYPE;
    }

    @GetMapping("/capacitor")
    public String[] getCapacitorTypes() {
        return CAPACITOR;
    }

    @GetMapping("/cable-type")
    public String[] getCableTypes() {
        return CABLE_TYPE;
    }
}
