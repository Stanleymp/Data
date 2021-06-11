package ProjetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoData {
	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();

		/* Passing a date using calendar */
		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("17/02/1999"));

		calendar.add(Calendar.DAY_OF_MONTH, 5);

		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

	}
}
