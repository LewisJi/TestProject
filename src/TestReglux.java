import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReglux {

	public static void main(String[] args) throws Exception {

		
		System.out.println(genOutPath("/home/013/ACA/ACA.txt", ""));
	}
	
	
	public static String genOutPath(String sourceFile, String targetDir) throws Exception {
		StringBuilder ret = new StringBuilder(); 
		String compareName = ""; // 比對old資料夾
		//151_WTD//043TED
				
		//		1/home/013/ACA/ACA.txt
		//		/home/013/ACA/1990/ACA.txt
		//		/home/013_TWN/ACA/1990/ACA.txt
		//		1/home/013_TWN/ACA/ACA.txt
		//		1/home/013TWN/ACA/1990/ACA.txt
		//		/home/013TWN/ACA/ACA.txt
							
		String regex = "(\\/\\d{3}\\w{0,7})(\\/\\S+)(\\/\\w+[.][a-z]{3})";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(sourceFile);
		//System.out.println(matcher.group(1));

		if (matcher.find()) {
		String bankCode = matcher.group(1);
		String tableName = matcher.group(2);
		String fileFullName = matcher.group(3) + ".bz2";
		String[] tableGroup = tableName.split("/"); 
		compareName = tableName.substring(tableName.lastIndexOf("/")+1, tableName.length()); 

		
		}
		return regex;
	}
}