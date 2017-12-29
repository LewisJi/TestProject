import java.util.ArrayList;
import java.util.List;

public class TestStringChain {

	public static void main(String[] args) {

		//String[] ar = { "1", "2", "3" };
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		for (int i = 0; i < a.size(); i++) {
				System.out.print(a.get(i));
				if(i != (a.size()-1)){
					System.out.print(", ");
				}
			
		}
	}

}
