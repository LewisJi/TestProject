
public class TestSingle {

	public static void main(String[] args) {

		SampleSingleton s = SampleSingleton.getInstance();
		s.setS("isPath");
		s.setPd("PD");
		
		DoWork1 dw = new DoWork1();
		System.out.println(dw.getFilePath());
	}

}
