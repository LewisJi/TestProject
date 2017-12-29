
public class TestStringReplace {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("1 $tableName1 b $tableName2");
		String s = "1 $tableName1 b $tableName2";
		s = s.replace("$tableName2", "yy").replace("$tableName1", "k");
		System.out.println(s);
		System.out.println(sb.toString().replace("$tableName2", "y1234y").replace("$tableName1", "k"));
	}

}
