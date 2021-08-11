package aula02;

 //@author Matheus Machado

import beans.Aluno;
import beans.Pessoa;
import beans.Professor;
 
public class Aula02Main {
    
    public static void main (String[] args){
        
        Pessoa pessoa00;
        pessoa00 = new Pessoa("10.101.101", "Bill Portoes", "bill.portoes@microsoft.com");
                
        Aluno pessoa01 = new Aluno("12345", "Marketing", "8",
                                   "01.010.010", "Steve Trabalhos", "steve.trabalhos@maca.com");
      
        Professor pessoa02 = new Professor("54321", "Mestre", "Sistemas Operacionais",
                                            "10.101.010", "Linus Trovador", "linus.trovador@ubuntu.com");
       
        System.out.println(pessoa00);
        System.out.println(pessoa01);
        System.out.println(pessoa02);
        
    }
    
}
