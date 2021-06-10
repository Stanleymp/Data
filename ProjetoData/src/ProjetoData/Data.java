package ProjetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
	public static void main(String[] args) throws ParseException {

		/*************************** Date ***************************/

		Date date = new Date();

		System.out.println("Data em Milissegundos: " + date.getTime());
		System.out.println("Dia da Semana: " + date.getTime());
		System.out.println("Data " + date.getDate() + "/" + date.getMonth() + "/" + (date.getYear() + 1900));
		System.out.println("Horário " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds() + "\n");

		/********************* SimpleDateFormat *********************/

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // This format to show the comum user
		System.out.println("Data " + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss"); // This format to save in DB
		System.out.println("Data DB: " + simpleDateFormat.format(date));

		System.out.println("Objeto Data: " + simpleDateFormat.parse("1125-02-17 14:30.0") + "\n");

		/************************* Calendar *************************/

		Calendar calendar = Calendar.getInstance();

		System.out.println("Calendar em Mili: " + calendar.getTimeInMillis());
		System.out.println("Calendar Dia da Semana: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Calendar Data: " + calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH)
				+ "/" + calendar.get(Calendar.YEAR));
		System.out.println("Calendar Horário: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE)
				+ ":" + calendar.get(Calendar.SECOND));
	}
}
