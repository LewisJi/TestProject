
public class SampleSingleton {

	private String s;
	private String pd;

	private static SampleSingleton ss;

	private SampleSingleton() {
	}

	public static SampleSingleton getInstance() {
		if(ss == null){
			ss = new SampleSingleton();
		}
		return ss;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getPd() {
		return pd;
	}

	public void setPd(String pd) {
		this.pd = pd;
	}

}
