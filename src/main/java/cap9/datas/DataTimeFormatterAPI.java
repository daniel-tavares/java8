package cap9.datas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTimeFormatterAPI {
	public static void main(String[] args) {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataFormatada=LocalDateAPI.getDataHoje().format(formatador);
		System.out.println(dataFormatada);
		
		DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dataHoraFormatada=LocalDateTimeAPI.getDataHoje().format(formatadorDataHora);
		System.out.println(dataHoraFormatada);
		
		
		
		LocalDateTime agora = LocalDateTime.now();
		String resultado = agora.format(DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println(resultado);
		
		
		
	}
}
