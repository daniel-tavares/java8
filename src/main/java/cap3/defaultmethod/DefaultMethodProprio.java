package cap3.defaultmethod;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethodProprio {
  public static void main(String[] args) {
	   List<String> nomes = new ArrayList<String>();
	   nomes.add("Daniel");
	   nomes.add("Danilo");
	   nomes.add("Daniele");
	   
	  
	  
  }
}


class ExportarArquivo implements Exportar{

	@Override
	public void exportarPdf() {
		tipoDocImpresso("PDF");
	}

	@Override
	public void exportarTxt() {
		tipoDocImpresso("TXT");
	}
	
}


interface Exportar {
	
	void exportarPdf();
	void exportarTxt();
	
	//JAVA8 - implementação de metodo dentro da interface.  
	default void tipoDocImpresso(String tipo) {
	    System.out.println("Realizando exportação de arquivo do tipo: "+tipo);	
	}
}
