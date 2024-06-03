

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestLambdaExecute {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("aaa","bbb","ccc");
		list.forEach(TestLambdaExecute::print);
		
		String ok ="ok";
		Runnable runa = ()->new TestLambdaExecute().print(ok);
		runa.run();
		
		String content2 = " ok";

        Consumer<String> consumer = content -> new TestLambdaExecute().print(content + content2);
        consumer.accept("Hello");
	}
	
	public static void print(String content) {
		System.out.println(content);
	}

}
