package ProjetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class FaixaTempo {
	public static void main(String[] args) throws ParseException {

		Long diasAusente = ChronoUnit.DAYS.between(LocalDate.parse("2021-06-12"), LocalDate.now());

		System.out.println(diasAusente + (diasAusente <= 1 ? " Dia Ausente" : " Dias Ausentes"));

		if (diasAusente >= 10) {
			System.out.println("Bonus Perdido!");
		} else if (diasAusente > 7) {
			System.out.println("Por favor! Logue na plataforma para atualizar seu Bonus!");
			System.out.println("Perderá o Bonus em " + (10 - diasAusente) + (diasAusente >= 9 ? " dia" : " dias"));
		} else {
			System.out.println("Bonus em dia!");
		}

	}
}
