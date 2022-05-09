import java.util.Scanner;

import classes.Quartos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Quartos[] reserva = new Quartos[10];  
    
        System.out.println("Pousada do Professor Gilson - Bem Vindo(a)!");

        int qtdAlunos = -1;

//Iniciando quartos vazios - O atributo validador diz se o quarto está ou não ocupado
        for (int i = 0; i < 10; i++){

            reserva[i] = new  Quartos(); 
            reserva[i].setValidador(0);
            
        }

//Limitando até 10 alunos
        do{   

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
            System.out.printf("%n%s, Digite o número do quarto que você quer:",nome);
            quarto = sc.nextInt();

            while((quarto <= 0 || quarto > 10) || (reserva[quarto].getValidador() != 0)){
                if (quarto <= 0 || quarto > 10){
                    System.out.println("ERRO. NUMERO ACIMA DE 10 OU MENOR QUE 0");
                    System.out.printf("%n%sDigite o número do quarto que você quer:",nome);
                    quarto = sc.nextInt();
                }else {
                    System.out.println("Este quarto já está reservado! Escolha outro!");
                    quarto = sc.nextInt();
                }
            } 

            reserva[quarto].setNome(nome);
            reserva[quarto].setEmail(email);
            reserva[quarto].setQuarto(quarto);
            reserva[quarto].setValidador(1);

            System.out.printf("%nSucesso! Sua reserva foi feita no quarto %d",quarto);

        }

        sc.close();
    }
}