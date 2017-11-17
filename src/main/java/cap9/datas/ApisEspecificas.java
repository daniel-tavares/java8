package cap9.datas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;

public class ApisEspecificas {
	public static void main(String[] args) {
		YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);
		System.out.println(anoEMes);
		System.out.println(anoEMes.getYear()+""+anoEMes.getMonthValue());
		LocalTime intervalo = LocalTime.of(12, 30);
		System.out.println(intervalo);
		
		
		System.out.println(LocalDate.of(2014, 12, 25));
		System.out.println(LocalDate.of(2014, Month.DECEMBER, 25));
		
		
		
	}
}
