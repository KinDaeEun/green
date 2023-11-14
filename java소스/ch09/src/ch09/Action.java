package ch09;

public interface Action {
	void execute();
	
}
class ReceiveAction implements Action{
	public void execute() {
		System.out.println("데이터 받아");
	}
}
class SendAction implements Action{
	public void execute() {
		System.out.println("데이터 보내");
	}
}
