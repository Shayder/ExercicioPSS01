package Projeto01;

/*
 * @author Shayder
 */
public class Aprovacao {
    private String superiorResponsavel;
    private double valorSolicitado;
    private boolean status;
    private boolean disponibilidade1;
    private boolean disponibilidade2;
    private boolean disponibilidade3;
    private boolean disponibilidade4;
    
    public Aprovacao(double valorSolicitado, boolean disponibilidade1, boolean disponibilidade2, boolean disponibilidade3, boolean disponibilidade4){
        this.valorSolicitado = valorSolicitado;
        this.disponibilidade1 = disponibilidade1;
        this.disponibilidade2 = disponibilidade2; 
        this.disponibilidade3 = disponibilidade3;   
        this.disponibilidade4 = disponibilidade4;    
    } 
   
   /**
     * @return the superiorResponsavel
     */
    public String getSuperiorResponsavel() {
        return superiorResponsavel;
    }

    /**
     * @param superiorResponsavel the superiorResponsavel to set
     */
    public void setSuperiorResponsavel(String superiorResponsavel) {
        this.superiorResponsavel = superiorResponsavel;
    }

    /**
     * @return the valorSolicitado
     */
    public double getValorSolicitado() {
        return valorSolicitado;
    }

    /**
     * @param valorSolicitado the valorSolicitado to set
     */
    public void setValorSolicitado(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the disponibilidade1
     */
    public boolean isDisponibilidade1() {
        return disponibilidade1;
    }

    /**
     * @param disponibilidade1 the disponibilidade1 to set
     */
    public void setDisponibilidade1(boolean disponibilidade1) {
        this.disponibilidade1 = disponibilidade1;
    }

    /**
     * @return the disponibilidade2
     */
    public boolean isDisponibilidade2() {
        return disponibilidade2;
    }

    /**
     * @param disponibilidade2 the disponibilidade2 to set
     */
    public void setDisponibilidade2(boolean disponibilidade2) {
        this.disponibilidade2 = disponibilidade2;
    }

    /**
     * @return the disponibilidade3
     */
    public boolean isDisponibilidade3() {
        return disponibilidade3;
    }

    /**
     * @param disponibilidade3 the disponibilidade3 to set
     */
    public void setDisponibilidade3(boolean disponibilidade3) {
        this.disponibilidade3 = disponibilidade3;
    }

    /**
     * @return the disponibilidade4
     */
    public boolean isDisponibilidade4() {
        return disponibilidade4;
    }

    /**
     * @param disponibilidade4 the disponibilidade4 to set
     */
    public void setDisponibilidade4(boolean disponibilidade4) {
        this.disponibilidade4 = disponibilidade4;
    }
    
    public boolean mecanismo(){
        if((this.getValorSolicitado() <= 500.00) && (this.isDisponibilidade1() == true)){
            this.setStatus(true);
            this.setSuperiorResponsavel("Gerente Imediato ao funcionário");
            return this.isStatus();
        }
        if((this.getValorSolicitado() <= 1500.00) && (this.isDisponibilidade2() == true)){
            this.setStatus(true);
            this.setSuperiorResponsavel("Gerente Geral");
            return this.isStatus();
        }
        if((this.getValorSolicitado() <= 5000.00) && (this.isDisponibilidade3() == true)){
            this.setStatus(true);
            this.setSuperiorResponsavel("Diretor financeiro");
            return this.isStatus();
        }
        if((this.getValorSolicitado() <= 15000.00) && (this.isDisponibilidade4()== true)){
            this.setStatus(true);
            this.setSuperiorResponsavel("Diretor Geral");
            return this.isStatus();
        }
        this.setSuperiorResponsavel("Nenhum supervisor está disponível!");
        return false;
    }

    

}

