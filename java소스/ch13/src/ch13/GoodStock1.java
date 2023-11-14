package ch13;
import java.io.Serializable;
// 직열화하는 클래스에는 Serializable를 구현해야 한다
public class GoodStock1 implements Serializable {
	String code;
	int num;
	public GoodStock1(String code, int num) {
		this.code = code; this.num = num;
	}
	@Override
	public String toString() {
		return "주식[코드:"+code+", 수량:"+num+"]";
	}
}