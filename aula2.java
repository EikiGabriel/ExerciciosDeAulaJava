package faculdade_exercicios_java;
import java.util.Scanner;

public class aula2 {
    /*
     * exer 1
     * 1. construir um programa em Java que leia 2 números inteiros e imprima o
     * maior número
     * lido.
     */
    /*
     * public static void main(String[] args) {
     * Scanner leia = new Scanner(System.in);
     * 
     * System.out.println("me informe um numero:");
     * int num1 = leia.nextInt();
     * 
     * System.out.println("me informe um numero:");
     * int num2 = leia.nextInt();
     * 
     * leia.close();
     * 
     * if (num1 > num2) {
     * System.out.println(num1 + " o primero número é o maior é " + num2 +
     * "é o menor");
     * } else {
     * System.out.println(num2 + " o segundo número é o maior é " + num1 +
     * "é o menor");
     * }
     * }
     */

    /*
     * exer 2
     * construir um programa em Java que leia um número inteiro e imprima “PAR”, se
     * o
     * número for par e imprima “ÍMPAR”, se o número for ímpar.
     */
    /*
     * public static void main(String[] args) {
     * Scanner leia = new Scanner(System.in);
     * 
     * System.out.println("me informe um numero:");
     * int num1 = leia.nextInt();
     * 
     * leia.close();
     * 
     * if (num1 % 2 == 0) {
     * System.out.println("O número é par.");
     * } else {
     * System.out.println("O número é ímpar.");
     * }
     * }
     */
    /*
     * exer 3
     * construir um programa em Java que leia um número inteiro e imprima
     * “Positivo”,
     * se o número lido for maior que 0, imprima “Negativo”, se o número lido for
     * menor que 0 e imprima “Nulo”, se o número lido for igual a 0.
     */
    /*
     * public static void main(String[] args) {
     * Scanner leia = new Scanner(System.in);
     * 
     * System.out.println("me informe um numero:");
     * int num1 = leia.nextInt();
     * 
     * leia.close();
     * 
     * switch (Integer.signum(num1)) {
     * case 1:
     * System.out.println(num1 + " é Positivo");
     * break;
     * case -1:
     * System.out.println(num1 +"é Negativo");
     * break;
     * default:
     * System.out.println(num1 + "é Nulo");
     * break;
     * }
     * }
     */
    /*
     * exer 4
     * construir um programa em Java que leia as 2 notas de um aluno e que calcule,
     * armazene
     * e imprima a média. Se a média for maior ou igual a 7, imprimir “Aprovado”,
     * caso contrário,
     * 
     * 
     * realizar a leitura de uma terceira nota, que terá peso 2 e
     * calcular, armazenar e
     * imprimir uma nova média. Se a nova média for maior ou igual a 6, imprimir
     * “Aprovado”,
     * caso contrário, imprimir “Reprovado”.
     */
    /* 
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("me informe a nota AV1: ");
        float nota1 = leia.nextFloat();
        System.out.println("me informe a nota AV2: ");
        float nota2 = leia.nextFloat();

        float media = (float) ((nota1 + nota2) / 2);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado, sua media foi " + media);
            System.out.println("me informe a nota AV3: ");
            float nota3 = leia.nextFloat();

            Float novaMedia = ((nota3 * 2) / 2);

            if (novaMedia >= 6) {
                System.out.println("Aprovado com " + novaMedia);
            } else {
                System.out.println("Reprovado com " + novaMedia);
            }
        }
        leia.close();
    }*/
    /* exer 5 construir um programa em Java que leia um número inteiro entre 1 e 7 e imprima o nome
    do dia da semana correspondente ao número, caso o número esteja fora do intervalo entre
    1 e 7, imprimir “Dia Inválido”. */

    /*
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Me inforeme o numero de 1 a 7");
        int dia = leia.nextInt();

        switch(dia){
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia Inválido");
                break;
        }
        leia.close();
    }

*/
    // exer 6 construir um programa em Java que leia 10 números inteiros e que calcule, armazene e
    //imprima o somatório de todos os números lidos.
/* 
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int soma =0;
        for(int i=0;i<10;i++){
            System.out.println("Me inforeme um numero:");
            int num = leia.nextInt();

            soma += num;
        }
        System.out.println("A soma dos numeros digitados foi:" + soma);


        leia.close();
    }
*/

    //exer 7 construir um programa em Java que leia a idade de 15 pessoas e calcule, armazene e
    //imprima a média das idades lidas.
    /*
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int total=0;
        for(int i=1;i<16;i++){
            System.out.println("Qual é a idade da pessoa " + i);
            int idade = leia.nextInt();

            total += idade;
        }
        System.out.println("A media de idade das pessoas é: " + total/15);


        leia.close();
        
    }
    */
    /*exer 8 construir um programa em Java que leia 10 números e imprima o maior número lido. 
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int max = 0; 

        for(int i=1;i<11;i++){
            System.out.println("me informe um numero ");
            int num = leia.nextInt();
        
            if(max < num){
                max = num;
            }
        }
        System.out.println("O maior numero da sequecia é: " + max);


        leia.close();
        
    }
*/

//exer 9 construir um programa em Java que leia 10 notas e imprima a maior e a menor nota lidas.

/*
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float max = -999999; float min = 9999999; 

        for(int i=1;i<11;i++){
            System.out.println("Me informe a nota " + i);
            float num = leia.nextFloat();
        
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }

        System.out.println("A maior nota foi: " + max);
        System.out.println("A menor nota foi: " + min);



        leia.close();
        
    }
*/
    //exer 10
    //construir um programa em Java que leia o sexo de 30 alunos e turma e calcule, armazene
    //e imprima a porcentagem de alunos do sexo masculino e a porcentagem do sexo feminino

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        boolean w = true;
        int contM =0; 
        
        int contF =0;

        for(int i=1;i<31;i++){
            System.out.println("Qual é o sexo do aluno "+ i +" M ou m ou F ou f?");
            char sexo = leia.next().charAt(0);
            //cara seja caracter errodo--------------
            while(w){
                if(sexo == 'M' || sexo == 'm' || sexo == 'F'|| sexo == 'm' ){
                    w = false;
                }
                else{
                    System.out.println("Caracter inválido");
                    break;
                }
            }
            //--------------------------------------
            if(sexo == 'M'|| sexo == 'm'){
                contM++;
            }
            if(sexo == 'F' || sexo == 'f'){
                contF++;
            }
        }

        System.out.println("A porcentagem de alunos do sexo Masculino é :" + (100*contM)/30 + "%");
        System.out.println("A porcentagem de alunos do sexo Feminino é :" + (100*contF)/30+ "%");

        leia.close();
        
        }

}   
