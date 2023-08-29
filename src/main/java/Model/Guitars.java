package Model;

import lombok.Data;

@Data
public class Guitars {

	String type;	
	String neck;
	String pickup;
	String fingerboard;
	String bridge;
	String body;
	String pickups;
	String bridge_type;
	String body_type;
	String pickups_type;
	String body_color;
	
	int nradius;
	// 픽업 갯수
	int pquantity;
	
	public void setBodyShape(String type, int pquantity) {		
		this.type = type;
		this.pquantity = pquantity;
	}
	
	public void setNeckType(String neck, int nradius) {
		this.neck = neck;
		this.nradius = nradius;
	}
	
}
