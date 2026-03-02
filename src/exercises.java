import java.util.Scanner;

public class exercises {
    Scanner scan = new Scanner(System.in);

    int userNum;
    int secretNum = 777;
    int numSumInt = 0;
    int evenCounter = 0;
    int oddCounter = 0;
    int smallerNum = 0;
    int biggerNum = 0;
    int firstUserNum;
    int secondUserNum;
    int auxSwitch;

    double loafOfBread;
    double distanciaSaltos;
    double numSumDouble = 0;
    double saltoMaior = 0;
    double saltoMenor = 0;
    double somaDistanciaSalto = 0;

    String userWord;
    String userName;
    String userPassword;

    /*
    Primeira questão
     */

    public void question1(){
        System.out.printf("==================================================%n" +
                          "----Você selecionou a primeira funcionalidade!%n----" +
                          "==================================================%n");
        for (int i = 0; i <= 30; i++) {
            System.out.println(i);
        }
    }

    /*
    Segunda questão
     */

    public void question2(){
        for (int i = 0; i <= 100; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public void question3(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Insira um número inteiro: ");
            userNum = scan.nextInt();

            if(userNum % 2 == 0){
                System.out.println(userNum + " é um número par");
            } else{
                System.out.println(userNum + " é um número ímpar");
            }
        }
    }

    public void question4(){
        for (userWord = null; userWord.equalsIgnoreCase("nao");){
            System.out.println("Escreva Sim ou Não: ");
            userWord = scan.next();

            if (userWord.equalsIgnoreCase("sim")){
                System.out.println("Você decidiu continuar");
            }else if (userWord.equalsIgnoreCase("nao")){
                System.out.println("Você decidiu sair.");
                System.out.println("Programa Encerrado.");
            }else {
                System.out.println("Palavra inválida. Tente novamente.");
            }
        }
    }

    public void question5(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Insira sua idade: ");
            userNum = scan.nextInt();

            numSumInt += userNum;
            System.out.println(numSumInt);
        }

        System.out.println("A média de idade é: " + numSumInt/10);
        numSumInt = 0;

    }

    public void question6(){
        System.out.print("Tente adivinhar o número secreto! Insira um número: ");
        userNum = scan.nextInt();

        for (; userNum != secretNum;){
            System.out.print("Tente novamente! Insira um novo número: ");
            userNum = scan.nextInt();

            if (userNum == secretNum){
                System.out.println("você acertou! O número secreto é " + secretNum);
            }
        }
    }

    public void question7(){
        for (int i = 0; i <= 10; i++) {
            if (i == 1){
                System.out.println("Informe 10 números inteiros a seguir.");
            }
            System.out.println("Informe o " + i + "º número: ");
            userNum = scan.nextInt();
            if (userNum % 2 == 0){
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        System.out.println("A quantidade de números pares é: " + evenCounter);
        System.out.println("A quantidade de números ímpares é: " + oddCounter);
    }

    public void question8(){
        System.out.println("Insira dois números inteiros entre 0 e 20 a seguir.");

        System.out.println("Digite o primeiro número: ");
        firstUserNum = scan.nextInt();

        while (firstUserNum < 0 || firstUserNum > 20){
            System.out.println("Apenas insira números dentro do intervalo.");
            firstUserNum = scan.nextInt();
        }

        System.out.println("Digite o segundo número: ");
        secondUserNum = scan.nextInt();

        while (secondUserNum < 0 || secondUserNum > 20){
            System.out.println("Apenas insira números dentro do intervalo.");
            secondUserNum = scan.nextInt();
        }

        if (firstUserNum > secondUserNum){
            auxSwitch = firstUserNum;
            firstUserNum = secondUserNum;
            secondUserNum = auxSwitch;
        }

        for (int i = firstUserNum; i <= secondUserNum; i++){
            System.out.println(i);
        }
    }

    public void question9(){
        for (int i = 1; ; i++){
            System.out.println("Digite seu nome de usuário: ");
            userName = scan.next();

            System.out.println("Digite sua senha: ");
            userPassword = scan.next();

            if (userName.equalsIgnoreCase(userPassword)){
                System.out.println("O seu nome de usuário e senha devem ser diferentes. Tente novamente.");
            }else {
                System.out.println("Seja bem-vindo(a)!");
                break;
            }
        }
    }

    public void question10(){
        System.out.println("Informe 5 números inteiros a seguir.");

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número: ");
            userNum = scan.nextInt();

            numSumInt += userNum;
        }

        System.out.println("A soma dos números informados é: " + numSumInt);
        System.out.println("A média dos números informados é: " + numSumInt/5);
    }

    public void question11(){
        System.out.println("Insira um número inteiro entre 1 e 9 a seguir:");
        userNum = scan.nextInt();

        while (userNum > 9 || userNum < 1){
            System.out.println("Inválido. Insira um número que está entre o 1 e 9.");
            userNum = scan.nextInt();
        }

        for (int i = 1; i <= 9; i++){
            System.out.println(userNum + " x " + i + " = " + (userNum * i));
        }
    }

    public void question12(){
        System.out.println("Seja bem-vindo(a)! Quantos pães vai querer?");
        System.out.println("Insira o valor da quantidade: ");
        userNum = scan.nextInt();

        for (int i = 1; i <= userNum; i++){

            if(i > 0 && i <=  10){
                loafOfBread = 0.18;
                numSumDouble += loafOfBread;
            } else if (i > 10 && i <= 20){
                loafOfBread = 0.16;
                numSumDouble += loafOfBread;
            } else if (i > 20 && i <= 30) {
                loafOfBread = 0.13;
                numSumDouble += loafOfBread;
            } else {
                loafOfBread = 0.09;
                numSumDouble += loafOfBread;
            }

            System.out.printf(i + " unidade(s): R$ %.2f\n", numSumDouble);

        }
    }

    public void question13(){
        for (; userNum != secretNum;){
            System.out.println("Advinhe o número: ");
            userNum = scan.nextInt();

            if (userNum == secretNum){
                System.out.println("Você acertou, o número secreto é " + secretNum);
                break;
            } else if (userNum < secretNum) {
                System.out.println("Chute um número maior");

            } else
            {
                System.out.println("chute um número menor");
            }
        }
    }

    public void question14(){
        System.out.println("Informe dez números a seguir.");

        for (int i = 1; i <= 10; i++){
            userNum = scan.nextInt();
            if (i == 1){
                smallerNum = userNum;
            } else if (userNum < smallerNum){
                smallerNum = userNum;
            }
        }

        System.out.println("O menor número dos quais você inseriu foi: " + smallerNum);
    }

    public void question15(){
        System.out.println("Informe dez números a seguir.");

        for (int i = 1; i <= 10; i++){
            userNum = scan.nextInt();
            if (i == 1){
                biggerNum = userNum;
            } else if (userNum > biggerNum){
                biggerNum = userNum;
            }
        }

        System.out.println("O maior número dos quais você inseriu foi: " + biggerNum);
    }

    public void question16(){
        System.out.println("Informe a quantidade a distância atingida nos saltos feitos pelo atleta a seguir.");

        for (int i = 1; i <= 5; i++){
            distanciaSaltos = scan.nextDouble();

            somaDistanciaSalto += distanciaSaltos;

            if (i == 1){
                saltoMenor = distanciaSaltos;
                saltoMaior = distanciaSaltos;

            } else if (distanciaSaltos < saltoMenor){
                saltoMenor = distanciaSaltos;

            } else if (distanciaSaltos > saltoMaior){
                saltoMaior = distanciaSaltos;

            }
        }
        System.out.printf("A média da distância dos saltos é: %.2f\n", somaDistanciaSalto/5);
        System.out.printf("O menor distância de salto dos saltos dados foi: %.2f\n", saltoMenor );
        System.out.printf("O maior distância de salto dos saltos dados foi: %.2f\n", saltoMaior );
    }
}
