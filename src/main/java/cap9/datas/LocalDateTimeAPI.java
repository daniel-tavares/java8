package cap9.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeAPI {
	
	public static LocalDateTime getDataHoje() {
		LocalDateTime agora = LocalDateTime.now();
		return agora;
	}
	
	public static void main(String[] args) {
		
		
	    System.out.println("\nDATA e HORA");
		System.out.println(getDataHoje());
		
		
		System.out.println("\nDATATIME COM LOCALDATE");
		LocalDateTime hojeAoMeioDia = LocalDate.now().atTime(12,0);
		System.out.println(hojeAoMeioDia);
		
		System.out.println("\nCOMBINANDO DATA E HORA");
		LocalTime agora = LocalTime.now();
		LocalDate hoje = LocalDate.now();
		LocalDateTime dataEhora = hoje.atTime(agora);
		System.out.println(dataEhora);
		
		
		
		
		System.out.println("\nDATA NO CONSTRUTOR");
		LocalDate date = LocalDate.of(2014, 12, 25);
		LocalDateTime dateTime = LocalDateTime.of(2014, 12, 25, 10, 30);
		System.out.println(date);
		System.out.println(dateTime);
		
		System.out.println("\nDATA ATUAL COM ANO PASSADO");
		LocalDate dataDoPassado = LocalDate.now().withYear(1988);
		System.out.println(dataDoPassado);
		System.out.println(dataDoPassado.getYear());
		System.out.println(dataDoPassado.getMonthValue());
		System.out.println(dataDoPassado.getMonth());
		
		
		System.out.println("\nVERIFICAR SE DATA É ANTERIOR, POSTERIOR OU IGUAL");
		LocalDate amanha = LocalDate.now().plusDays(1);
		System.out.println(hoje.isBefore(amanha));
		System.out.println(hoje.isAfter(amanha));
		System.out.println(hoje.isEqual(amanha));
		
	}
}
