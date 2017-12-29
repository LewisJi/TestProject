import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class TestGetName {

	protected static List<police_data_list> policeList;
	
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException {
		// TODO Auto-generated method stub
		SetInputData_TD();
	}

	
	private static void SetInputData_TD() throws IOException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		//FileInputStream fis = new FileInputStream(filePath);
		byte[] b = new byte[254];
		int offset = 0;
		//fis.read(b, offset, 254);
		while (b != null && b.length != 0)
		{
			police_data_list policeData = new police_data_list();
			Class<?> rfClass = policeData.getClass();
			Field[] fields = rfClass.getDeclaredFields();
			for(Field field : fields)
			{
				if(field.isAnnotationPresent(ClassImpl.class))
				{
					ClassImpl annotation = field.getAnnotation(ClassImpl.class);
					int start = annotation.start();
					int end = annotation.end();
					policeData.getClass().getMethod("set" + field.getName(), String.class).invoke(policeData, new String(Arrays.copyOfRange(b, start, end),"big5").trim());
				}
			}
			policeList.add(policeData);
			offset += 1; //line separator
			offset += 254;
			//fis.read(b, offset, 254);
		}
		//fis.close();
	}
}
