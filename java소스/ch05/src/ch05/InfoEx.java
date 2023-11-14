package ch05;

public class InfoEx {
	public static void main(String[] args) {
		Info i1 = new Info("로제", 26, "졸기");
		Info i2 = new Info("보검", 31, "울기");
		Info i3 = new Info("하니", 26, "놀기");

//		i1.prn();i2.prn();i3.prn(;)
		Info[] in = { i1, i2, i3 };
		for (Info i : in) {
			i.prn();
		}
//		for (int i = 0; i < in.length; i++) {
//			in[i].prn();
//		}
	}
}
