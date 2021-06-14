package ProjetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GerandoParcelas {

	public static void main(String[] args) throws ParseException {

		/* USING CALENDAR */
		/*
		 * Calendar calendar = Calendar.getInstance(); calendar.setTime(new
		 * SimpleDateFormat("dd/MM/yyyy").parse("15/06/2021"));
		 * 
		 * for (int parcela = 1; parcela <= 12; parcela++) {
		 * calendar.add(Calendar.MONTH, 1); System.out.println(parcela + "ª Parcela: " +
		 * new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		 * 
		 * }
		 */

		/* USING LOCALDATE AND PLUS */

		LocalDate dataAtual = LocalDate.now();

		for (int parcela = 1; parcela <= 12; parcela++) {
			dataAtual = dataAtual.plusMonths(1);
			System.out.println(
					parcela + "ª com vencimento em: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}

	}
}
