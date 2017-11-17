package cap5.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;

import model.Usuario;

/* 
 * MetthodReference é vc simplificar a escrido lambda informando o Tipo::operacao
 */
public class MethodReference {

	public static void main(String[] args) {

		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("Joana"));
		usuarios.add(new Usuario("Vanessa"));
		usuarios.add(new Usuario("Bia"));
		
		System.out.println("Ativa todos os usuarios.");
		Consumer<Usuario> consumer= Usuario::ativarUsuario;
		usuarios.forEach(consumer);
		usuarios.forEach(System.out::println);
		
		System.out.println("\nDesativa usuario vanesssa");
	    Usuario usuario=usuarios.get(1);
	    Runnable bloco=usuario::desativarUsuario;
	    bloco.run();
	    usuarios.forEach(System.out::println);
	    
	    
	    System.out.println("\nCriar um novo objeto");
	    Supplier<Usuario> criadorDeUsuarios = Usuario::new;
	    Usuario novo = criadorDeUsuarios.get();
		novo.setNome("Novo nome");
		System.out.println(novo);
		
		System.out.println("\nCriar um novo objeto com um parametro no contrutor");
		Function<String, Usuario> criadorDeUsuarios2 = Usuario::new;
		Usuario usuario1 = criadorDeUsuarios2.apply("Rodrigo Turini");
		Usuario usuario2 = criadorDeUsuarios2.apply("Paulo Silveira");
		System.out.println(usuario1);
		System.out.println(usuario2);
		
		 System.out.println("\nCriar um novo objeto com dois parametro no contrutor");
		 BiFunction<String, Boolean,Usuario> criadorDeUsuarios3= Usuario::new;
		 Usuario usuario3 = criadorDeUsuarios3.apply("Rodrigo Turini", true);
		 Usuario usuario4 = criadorDeUsuarios3.apply("Paulo Silveira",false);
		 System.out.println(usuario3);
		 System.out.println(usuario4);
		 
		 
		 BiFunction<Integer, Integer, Integer> max=Math::max;
		 ToIntBiFunction<Integer, Integer> max2 = Math::max;
		 IntBinaryOperator max3 = Math::max;
		 
		 System.out.println(max.apply(23, 35));
		 System.out.println(max2.applyAsInt(234, 123));
		 System.out.println(max3.applyAsInt(234, 123));
		 
		 
	}

}


