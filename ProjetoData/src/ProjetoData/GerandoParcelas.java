package ProjetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerandoParcelas {

	public static void main(String[] args) throws ParseException {

		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2021");

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);

		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);

			System.out.println("Data da " + parcela + "ª parcela é: "
					+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}

	}
}
