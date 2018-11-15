package br.com.projuris;

public class MyFindCharTest {
	public static void main(String[] args) {
		MyFindChar findChar = new MyFindChar();
		
		char uniqueStressChar = findChar.findChar("stress");
		System.out.println("A primeira letra única da palavra stress é: \""+uniqueStressChar+"\"");
		
		char uniqueReembolsarChar = findChar.findChar("reembolsar");
		System.out.println("A primeira letra única da palavra reembolsar é: \""+uniqueReembolsarChar+"\"");
		
		char uniqueBabarChar = findChar.findChar("baba");
		System.out.println("A primeira letra única da palavra baba é: \""+uniqueBabarChar+"\"");
	}
}
