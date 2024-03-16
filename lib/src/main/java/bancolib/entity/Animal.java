package bancolib.entity;

public class Animal {
    
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void acao(){
        throw new RuntimeException("PRECISA SER IMPLEMENTADO!");
    }
}
