

import java.util.Scanner;

public class CalculoAlturaSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaHomens = 0;
        int numMulheres = 0;
        int numHomens = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a altura (em metros) da pessoa " + (i + 1) + ": ");
            double altura = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Digite o sexo (M para masculino, F para feminino) da pessoa " + (i + 1) + ": ");
            char sexo = scanner.nextLine().charAt(0);

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (sexo == 'M' || sexo == 'm') {
                somaAlturaHomens += altura;
                numHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                numMulheres++;
            } else {
                System.out.println("Sexo inválido! Por favor, digite M ou F.");
                i--; 
            }
        }

        double mediaAlturaHomens = somaAlturaHomens / numHomens;

        System.out.println("Maior altura do grupo: " + maiorAltura + " metros");
        System.out.println("Menor altura do grupo: " + menorAltura + " metros");
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens + " metros");
        System.out.println("Número de mulheres: " + numMulheres);
    }
}


