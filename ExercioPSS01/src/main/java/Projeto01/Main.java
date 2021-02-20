package Projeto01;

public class Main {
    
    public static void main(String args[]) {
        
        
        Aprovacao aprovacao = new Aprovacao(35500.0, false, true, true, true);
        System.out.println("STATUS:" + aprovacao.mecanismo());
        
        System.out.println("RESPONSÁVEL:" + aprovacao.getSuperiorResponsavel());


 
    }

}

