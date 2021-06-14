package ProjetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class FaixaTempo {
	public static void main(String[] args) throws ParseException, InterruptedException {

		/* WORKING WITH DATES - CHRONOUNIT */

		Long diasAusente = ChronoUnit.DAYS.between(LocalDate.parse("2021-06-12"), LocalDate.now());
		int bonus = 15;

		System.out.println(diasAusente + (diasAusente <= 1 ? " Dia Ausente" : " Dias Ausentes"));

		if (diasAusente >= bonus) {
			System.out.println("Bonus Perdido!");
		} else if (diasAusente > (bonus - 3)) {
			System.out.println("Por favor! Logue na plataforma para atualizar seu Bonus!");
			System.out.println(
					"Perderá o Bonus em " + (bonus - diasAusente) + (diasAusente >= (bonus - 1) ? " dia" : " dias"));
		} else {
			System.out.println("Bonus em dia!" + "\n");
		}

		/* WORKING WITH TIMES INSTANT AND DURATION */

		Instant inicio = Instant.now();
		Thread.sleep(2000);
		Instant ifinal = Instant.now();
		Duration duracao = Duration.between(inicio, ifinal);

		System.out.println("Duração em Mili Segundos: " + duracao.toMillis() + "\n");

		/* WORKING WITH LOCALDATE TO COMPARE DATES */

		LocalDate dataAntiga = LocalDate.of(2020, 02, 17);
		LocalDate dataNova = LocalDate.of(2021, 06, 12);

		System.out.println("A Data Antiga é Depois que a Data Nova? " + dataAntiga.isAfter(dataNova));
		System.out.println("A Data Antiga é Antes que a Data Nova? " + dataAntiga.isBefore(dataNova));
		System.out.println("A Data Antiga é Igual a Data Nova? " + dataAntiga.isEqual(dataNova) + "\n");

		/* USING PERIOD */

		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.println("O período entre a Data Antiga e a Data Nova é: " + periodo);
		System.out.println("O período entre a Data Antiga e a Data nova é: " + periodo.getYears() + " anos "
				+ periodo.getMonths() + " meses" + " e " + periodo.getDays() + " dias");
		System.out.println("Somente Meses: " + periodo.toTotalMonths());
	}
}
