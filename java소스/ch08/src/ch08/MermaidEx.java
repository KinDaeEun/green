package ch08;

public class MermaidEx {
	public static void main(String[] args) {
		Mermaid mm = new Mermaid();
		mm.move();
		mm.swim();
		System.out.println("다리: " + mm.leg);
	}
}
