// 1 - Pedir peso em kg
// 2 - Pedir altura em m
// 3 - Calcular IMC => peso / (altura * altura)
// 4 - Exibir classificação
// < 18.5 => Abaixo do peso
// >= 18.5 e <= 24.9 => Peso normal
// >= 25 e < 29.9 => Sobrepeso
// Mais que isso: obesidade

package secao6_calcIMC;

import java.util.Scanner;

public class CalculadoraIMC {

    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");

        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");

        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5) {
            System.out.println("Seu IMC é: " + imc + ". Classificação: Abaixo do peso!");
        } else if(imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu IMC é: " + imc + ". Classificação: Peso normal!");
        } else if(imc >= 25 && imc < 29.9) {
            System.out.println("Seu IMC é: " + imc + ". Classificação: Sobrepeso!");
        } else {
            System.out.println("Seu IMC é: " + imc + ". Classificação: Obesidade!");
        }


        scanner.close();
    }
    
}
