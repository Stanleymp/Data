package ProjetoData;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataAPI {
	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();
		LocalTime horaAtual = LocalTime.now();
		LocalDateTime dtHrAtual = LocalDateTime.now();

		System.out.println("Data Atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Hora Atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		System.out.println("Data e Hora Atual: " + dtHrAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

	}
}
