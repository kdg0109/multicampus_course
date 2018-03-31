package day16;

interface Testable {
	final static String fs = "Interface Test";
	abstract void output(String s);
}

public class InnerTest4 {
	void pr(Testable o) {
		o.output("Test");
		System.out.println(Testable.fs);
	}
	public static void main(String[] args) {
		System.out.println("Main start !!");
		InnerTest4 n = new InnerTest4();
		
		n.pr(new Testable() {
			int su = 100;
			@Override
			public void output(String s) {
				System.out.println("Anonymous Class : " + s);
				System.out.println("Anonymous Class : " + su);
			}
		});
	}
}
