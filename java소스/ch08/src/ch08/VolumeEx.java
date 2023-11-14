package ch08;

public class VolumeEx {
	public static void main(String[] args) {
		Volume[] vols = {new Radio(), new TV(), new Speaker()};
		for(Volume v: vols) {
			v.volumeUp();
			v.volumeDown();
		}
	}
}
