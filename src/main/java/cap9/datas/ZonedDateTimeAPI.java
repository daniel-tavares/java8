package cap9.datas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeAPI {

	public static void main(String[] args) {
	       System.out.println("\nDATA COM TIMEZONE");
	   	   ZonedDateTime tokyo = ZonedDateTime.of(2011, 5, 2, 10, 30, 0, 0, ZoneId.of("Asia/Tokyo"));
	       ZonedDateTime saoPaulo = ZonedDateTime.of(2011, 5, 2, 10, 30, 0, 0, ZoneId.of("America/Sao_Paulo"));
	       System.out.println(saoPaulo);
	      
	       System.out.println("\nDATA COM TIMEZONE");
	   	   LocalDateTime semTimeZone = saoPaulo.toLocalDateTime();
		   System.out.println(semTimeZone);
		   
		   
		   System.out.println("\nnComparacao");
		   System.out.println(tokyo.isEqual(saoPaulo));
		   
		   
		   tokyo = tokyo.plusHours(12);
		   
		   System.out.println(tokyo.isEqual(saoPaulo));
		   
		   
		   
	}
}
