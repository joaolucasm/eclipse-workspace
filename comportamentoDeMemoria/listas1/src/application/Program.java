package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list; //Lista nao aceita tipos primitivos, apenas classes
		
		list = new ArrayList<>(); //Ele não é iniciado como um objeto qualquer, e sim como uma interface, por isso é diferente
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Marta");
		list.add("Ana");
		list.add(2,"Marco");
		
		System.out.println(list.size());
		
		for(String x:list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		//list.remove("Ana");//consegue remover valores com base na comparação
		//list.remove(1);//consegue remover valores com base no index na lista
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x:list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		System.out.println("------------------------------");
		
		//Operação utilizada para filtrar os nomes de uma lista pelos que começam apenas pela letra A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
		
		for(String x:result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		//Operação utilizada para achar a primeira ocorrencia de um nome com A na lista, se não achar, ele retorna null
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		
	}

}
