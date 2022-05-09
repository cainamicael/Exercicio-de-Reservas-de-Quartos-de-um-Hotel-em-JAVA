import java.util.Scanner;

import classes.Quartos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Quartos[] vetAluguel = new Quartos[10];  
    
        System.out.println("Pousada do Professor Gilson - Bem Vindo(a)!");

        int qtdAlunos = -1;

        do{
           

        System.out.println("Digite a quantidade de alunos: ");
        qtdAlunos = sc.nextInt();

        if(qtdAlunos <= 0 || qtdAlunos > 10){
            System.out.println("ERRO!! ");
        }

    }while(qtdAlunos <= 0 || qtdAlunos > 10 );

        


        sc.close();
    }
}
