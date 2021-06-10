package ProjetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		String dia = "";

		switch (date.getDay()) {
		case 0:
			dia = "Domingo";
			break;
		case 1:
			dia = "Segunda-Feira";
			break;
		case 2:
			dia = "Terça-Feira";
			break;
		case 3:
			dia = "Quarta-Feira";
			break;
		case 4:
			dia = "Quinta-Feira";
			break;
		case 5:
			dia = "Sexta-Feira";
			break;
		case 6:
			dia = "Sábado";
			break;
		}

		System.out.println("Dia da Semana: " + dia);
		System.out.println("Data " + date.getDate() + "/" + date.getMonth() + "/" + (date.getYear() + 1900));
		System.out.println("Horário " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());

		/*************** SimpleDateFormat ***************/

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // This format to show the comum user
		System.out.println("Data " + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss"); // This format to save in DB
		System.out.println("Data DB: " + simpleDateFormat.format(date));

		System.out.println("Formato Data: " + simpleDateFormat.parse("1125-02-17 14:30.0"));

	}
}
