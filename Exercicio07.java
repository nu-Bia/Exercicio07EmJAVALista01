//7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever *a área do retângulo. Dica a=b.h
import java.util.Scanner;

public class Exercicio07 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor da base do retângulo");

int base= sc.nextInt();

System.out.println("Digite o valor da altura do retângulo");

int altura= sc.nextInt();

System.out.println(base*altura);

}

}