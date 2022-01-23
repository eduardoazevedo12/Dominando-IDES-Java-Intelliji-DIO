package br.com.dio.calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a,b;
        System.out.print("Digite o primeiro número:");
        a= scan.nextInt();
        System.out.print("Digite o segundo número:");
        b= scan.nextInt();

        float somar = somar(a, b);
        float subtrair = subtrair(a, b);
        float multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);
        System.out.println("Soma dos valores= "+somar);
        System.out.println("Subtração dos valores= "+subtrair);
        System.out.println("Multiplicação dos valores= "+multiplicar);
        System.out.println("Divisão dos valores= "+dividir);

    }
    public static float somar(float a,int b){
        return a+b;
    }public static float subtrair(float a,int b){
        return a-b;
    }public static float multiplicar(float a,int b){
        return a*b;
    }public static float dividir(float a,int b){
        return a/b;
    }

}
