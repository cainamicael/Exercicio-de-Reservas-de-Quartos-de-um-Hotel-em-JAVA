import java.util.Scanner;

import classes.Quartos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Quartos[] reserva = new Quartos[10];  
    
        System.out.println("Pousada do Professor Gilson - Bem Vindo(a)!");

        int qtdAlunos = -1;

<<<<<<< HEAD
        do{
=======
//Iniciando quartos vazios
        for (int i = 0; i < 10; i++){

            reserva[i] = new  Quartos();
            reserva[i] = null;

        }

//Limitando até 10 alunos
        do{   
>>>>>>> fb853ea9faa9a9a3dd0f81bb8984de3412fe08a6
           
        System.out.println("Digite a quantidade de alunos: ");
        qtdAlunos = sc.nextInt();

        if(qtdAlunos <= 0 || qtdAlunos > 10){
            System.out.println("ERRO!! ");
        }

        }while(qtdAlunos <= 0 || qtdAlunos > 10 );

//Registrando os estudantes
        String nome, email;
        int quarto;

        for (int a = 0; a < qtdAlunos; a++){ 

            System.out.printf("%nDigite o seu nome:");
            nome = sc.next();
            System.out.printf("%n%s, digite o seu Email:",nome);
            email = sc.next();
            System.out.printf("%n%sDigite o número do quarto que você quer:",nome);
            quarto = sc.nextInt();

            while((quarto <= 0 || quarto > 10) && (reserva[quarto] != null)){
                if (quarto <= 0 || quarto > 10){
                    System.out.println("ERRO. NUMERO ACIMA DE 10 OU MENOR QUE 0");
                    System.out.printf("%n%sDigite o número do quarto que você quer:",nome);
                    quarto = sc.nextInt();
                }else {
                    System.out.println("Este quarto já está reservado! Escolha outro!");
                }
            } 

            reserva[quarto].setNome(nome);
            reserva[quarto].setEmail(email);
            reserva[quarto].setQuarto(quarto);

            System.out.printf("%nSucesso! Sua reserva foi feita no quarto %d",quarto);

        }

        sc.close();
    }
}
