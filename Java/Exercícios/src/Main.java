import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Soma.calcular();
        //Perfil.teste();
        //Estudos.anotacoes();
        //Subtracao.subtrair();
    }
}


class Subtracao {
    public static void subtrair() {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o primeiro valor: ");
        int valor1 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo valor: ");
        int valor2 = Integer.parseInt(input.nextLine());

        int resultado = valor1 - valor2;

        System.out.printf("os valores somados são %d - %d e a subtração deles é = %d", valor1, valor2, resultado);
    }
}

class Perfil {
    public static void teste() {
        String nome = "Lucas";
        System.out.println("Olá, " + nome + "!");
        System.out.println("Como você está se sentindo hoje?");
    }
}

class Soma {
    public static void calcular () {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digiter o primeiro valor: ");
        int valor1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo valor: ");
        int valor2 = Integer.parseInt(scanner.nextLine());

        int resultado = valor1 + valor2;

        System.out.println("Os valores digitados foram " + valor1 + "+" + valor2 + " e a soma entre ele é = " + resultado);
    }
}

class Estudos {
    public static void anotacoes() {
        System.out.println("Anotações de estudos");
        System.out.println("Digitar PSVM e apertar enter ou tab escreve public static void main (String[] args)");
        System.out.println("Digitar SOUT e apertar tab ou enter digita System.out.println");
    }

}

