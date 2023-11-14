package ch09;

public class NewInsEx1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		ReceiveAction ra = new ReceiveAction();
		Class clazz = Class.forName("ch09.ReceiveAction");
		Action action = (Action)clazz.newInstance();
		action.execute();
	}
}
