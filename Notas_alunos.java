package notas;

import java.util.Scanner;

public class Notas_alunos {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int notas = 10;
	double soma=0;
	int abaixoMedia=0;
	int acimaMedia=0;
	double[] notaAlunos = new double[notas];
	
	for(int i=0; i<notas; i++) {
		System.out.println("Insira a nota do " + (i+1) + "ºAluno");
		notaAlunos[i] = input.nextDouble();
		soma+=notaAlunos[i];
		
	}
	for(int i=0; i<notas; i++) {
		if(notaAlunos[i] < 7) {
			abaixoMedia++;
		}else {
			acimaMedia++;
		}
	}
	
	double media = soma/notas;
	System.out.println("A nota dos alunos:");
	for(int i=0; i< notas; i++) {
		System.out.println(notaAlunos[i]);
		
	}
	
	System.out.println("A media das notas : "+ " " +media+ "");
	System.out.println("Quantidade de notas abaixo da media: " +  abaixoMedia);
	System.out.println("Quantidade de notas acima ou igual a Media: " + acimaMedia);
	
}
}
