//7) Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever *a �rea do ret�ngulo. Dica a=b.h
import java.util.Scanner;

public class Exercicio07 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor da base do ret�ngulo");

int base= sc.nextInt();

System.out.println("Digite o valor da altura do ret�ngulo");

int altura= sc.nextInt();

System.out.println(base*altura);

}

}