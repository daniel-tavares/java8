package cap6.stream;
/*
 * count -quantos elementos há no Stream , 
 * skip - para pular os n próximos elementos,
 * limit - para cortar o número de elementos
 * 
 * Streams Primitivos
 * O IntStream , o LongStream e o DoubleStream
 * 
 * Streams Infinitos
 * Random random = new Random(0);
 * IntStream stream = IntStream.generate(() -> random.nextInt());
 * int valor = stream.sum(); // Stream nunca terminará de executar.
 * 
 * Operações de curto circuito
 * São operações que não precisam processar todos os elementos(Limit,findFirst).
 * 
 * Random random = new Random(0);
 * IntStream stream = IntStream.generate(() -> random.nextInt());
 * List<Integer> list = stream
 * .limit(100)
 * .boxed()
 * .collect(Collectors.toList());
 * 
 * Random random = new Random(0);
 * List<Integer> list = IntStream
 * .generate(() -> random.nextInt())
 * .limit(100)
 * .boxed()
 * .collect(Collectors.toList());
 * 
 */
public class Outros {

}
