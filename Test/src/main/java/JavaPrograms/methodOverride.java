package JavaPrograms;

public class methodOverride {
	void draw() {
		System.out.println("This is draw in super class.");
	}
}
class square extends methodOverride {
	@Override
	void draw() {
		System.out.println("This is draw in square class.");
	}
	public static void main(String[] args) {
		methodOverride s = new square();
		s.draw();
	}
}
