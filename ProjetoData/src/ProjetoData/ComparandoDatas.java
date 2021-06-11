package ProjetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparandoDatas {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimentoBoleto = simpleDateFormat.parse("15/06/2021");
		Date dataAtual = simpleDateFormat.parse("16/06/2020");

		if (dataVencimentoBoleto.after(dataAtual)) {
			System.out.println("Boleto Válido!");
		} else {
			System.out.println("Boleto Vencido!");
		}

	}
}
