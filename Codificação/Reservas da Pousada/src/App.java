import java.util.Scanner;

import classes.Quartos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Quartos[] vetAluguel = new Quartos[10];

        System.out.println("Pousada do Professor Gilson - Bem Vindo(a)!");

        System.out.println("Digite a quantidade de alunos: ");
        
        int qtdAlunos = sc.nextInt();
        
        


        sc.close();
    }
}
