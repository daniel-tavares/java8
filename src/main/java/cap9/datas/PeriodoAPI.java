package cap9.datas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodoAPI {
	public static void main(String[] args) {

		Period periodo = Period.between(LocalDateAPI.getDataHoje(), LocalDateAPI.getDataOlimpiada());
		System.out.println("Faltam "+periodo.getYears()+" anos ,"+periodo.getMonths()+" meses e "+periodo.getDays()+" dias");
		
		
		LocalDate agora = LocalDate.now();
		LocalDate outraData = LocalDate.of(2017, Month.DECEMBER, 25);
		long natal = ChronoUnit.DAYS.between(agora,outraData);
		System.out.println("Faltam "+natal+" Dias para o Natal");
		
		
		long dias = ChronoUnit.DAYS.between(agora,outraData);
		long meses = ChronoUnit.MONTHS.between(agora,outraData);
		long anos = ChronoUnit.YEARS.between(agora,outraData);
		System.out.printf("%s dias, %s meses e %s anos", dias, meses, anos);
		
		
		System.out.println("\nPERIODO");
		Period periodo2 = Period.between(agora,outraData);
		System.out.printf("%s dias, %s meses e %s anos",
		periodo.getDays(), periodo2.getMonths(), periodo2.getYears());
		
		
		System.out.println("\nRESOLVENDO PERIODO NEGATIVO");
		Period periodo3 = Period.between(agora,outraData);
		if (periodo3.isNegative()) {
		periodo = periodo3.negated();
		}
		System.out.printf("%s dias, %s meses e %s anos",
				periodo3.getDays(), periodo3.getMonths(), periodo3.getYears());
		
		
		System.out.println("\nDURACAO");
		LocalDateTime agora2 = LocalDateTime.now();
		LocalDateTime daquiAUmaHora = LocalDateTime.now().plusHours(1);
		Duration duration = Duration.between(agora2, daquiAUmaHora);
		if (duration.isNegative()) {
		duration = duration.negated();
		}
		System.out.printf("%s horas, %s minutos e %s segundos",
		duration.toHours(), duration.toMinutes(), duration.getSeconds());
	}
}
