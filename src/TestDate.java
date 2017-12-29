import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate {

	public static void main(String[] args) {

		
		
		Calendar calendar1 = new GregorianCalendar();
		Date date1 = Date.valueOf("2008-08-01");
		calendar1.setTime(date1);
		Calendar calendar2 = new GregorianCalendar();
		Date date2 = Date.valueOf("2008-09-02");
		calendar2.setTime(date2);
		
		
		System.out.println(calendar1.compareTo(calendar2));
		
	}

}
