package ch12;

public class Account1Ex {
	public static void main(String[] args) {
		Account1 act = new Account1(10000);//통장 개설
		Account1User[] au = new Account1User[5];
		au[0] = new Account1User(act, "로제");
		au[1] = new Account1User(act, "보검");
		au[2] = new Account1User(act, "은우");
		au[3] = new Account1User(act, "제니");
		au[4] = new Account1User(act, "하은");
		
		for(Account1User a: au) {
			a.start();
		}
	}
}
