import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestRf {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, UnsupportedEncodingException, NoSuchFieldException {
		acct_data_list acctData = new acct_data_list();
		Class<?> rfClass = acctData.getClass();
		Field[] fields = rfClass.getDeclaredFields();
		int i = 0;
		for(Field field : fields)
		{
			if(field.isAnnotationPresent(ClassImpl.class))
			{
				ClassImpl annotation = field.getAnnotation(ClassImpl.class);
				int start = annotation.start();
				int end = annotation.end();
				Field chap = rfClass.getDeclaredField(field.getName());
				chap.set(acctData, Integer.valueOf(i++).toString());
				//chap.set(acctData, Integer.valueOf(i++).toString());
				//rfClass.getMethod("set" + field.getName(), String.class).invoke(acctData, new String(Arrays.copyOfRange(new byte[254], start, end),"big5").trim());
			}
			
		}
		System.out.println(acctData.getCUSTOMER_ID());
			
	}
	
	

	
	
}
