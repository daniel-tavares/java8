package cap9.datas;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateAPI {

	public static LocalDate getDataHoje() {
		LocalDate hoje = LocalDate.now(); 
        return hoje;
	}
	
	public static LocalDate getDataOlimpiada() {
		LocalDate olimpiadasRio = LocalDate.of(2020, Month.JUNE, 5);
        return olimpiadasRio;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Data de HOJE");
		System.out.println(getDataHoje());
		
        
        System.out.println("\nINCREMENTANDO - DECREMENTADNO");
        System.out.println("Menos 1 ano: "+getDataHoje().minusYears(1));
        System.out.println("Menos 4 meses:"+getDataHoje().minusMonths(4));
        System.out.println("Menos 2 dias: "+getDataHoje().minusDays(2));

        System.out.println("Mais 1 anos: "+getDataHoje().plusYears(1));
        System.out.println("Mais 4 meses: "+getDataHoje().plusMonths(4));
        System.out.println("Mais 2 dias: "+getDataHoje().plusDays(2));
        
      
        

        
        System.out.println("\nPERIODO COM SUBTRACAO");
        int anosParaInicio= getDataOlimpiada().getYear() - getDataHoje().getYear();
        System.out.println("Faltam: "+anosParaInicio+" anos para o inicio");
      
        
        System.out.println("ORIGINAL É IMUTAVEL - É CRIADO UMA NOVA INSTANCIA");
        LocalDate proximasOlimpiadas = getDataOlimpiada().plusYears(4);
        System.out.println(proximasOlimpiadas);
        
      
 	}
}
