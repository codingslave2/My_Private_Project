package Model;

import lombok.Data;

@Data
public class OrderProduct {
	
	String gname;
	int price, count, total;
	
	// 기타 커스텀 총액
	public int getTotal() {
		total = price * count;
		return total;
	}
	
}
