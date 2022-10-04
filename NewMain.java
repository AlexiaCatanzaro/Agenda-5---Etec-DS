
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexia
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaraçao de variáveis
int idade; // armazena a idade
Scanner leitor = new Scanner(System.in);
//entrada de dados
System.out.println("Entre com a sua idade");
idade = leitor.nextInt();
//Decisão
if (idade >=60){
System.out.println("Fila prioritária");}
if (idade ==60){
System.out.println ("Idade igual a 60");} 

if (idade >=80){
System.out.println ("Fila 80+");
} 
if (idade == 80) {
    System.out.println ("Idade igual a 80");
   
} if (idade <60) {System.out.println("Fila comum");}

    }
}//fim do if

    
    

