package ProjetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class FaixaTempo {
	public static void main(String[] args) throws ParseException {

		Long dias = ChronoUnit.DAYS.between(LocalDate.parse("1452-06-15"), LocalDate.now());
		System.out.println("Possuem " + dias + " dias entre a faixa de datas.");
		
	}
}
