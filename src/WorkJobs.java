
public abstract class WorkJobs {

	private String filePath;
	private String pdType;

	
	public WorkJobs(){
		SampleSingleton s = SampleSingleton.getInstance();
		this.filePath = s.getS();
		this.pdType = s.getPd();
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public String getPdType() {
		return pdType;
	}


	public void setPdType(String pdType) {
		this.pdType = pdType;
	}
	
}
