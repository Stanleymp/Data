package ProjetoData;

import java.util.Date;

public class Data {
	public static void main(String[] args) {

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
			dia = "Ter�a-Feira";
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
			dia = "S�bado";
			break;
		}

		System.out.println("Dia da Semana: " + dia);
		System.out.println("Data " + date.getDate() + "/" + date.getMonth() + "/" + (date.getYear() + 1900));
		System.out.println("Hor�rio " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
	}
}
