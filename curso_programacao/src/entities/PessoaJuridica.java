package entities;

public class PessoaJuridica extends Contribuinte {
    
    private double numero_de_funcionarios;

    public PessoaJuridica(String name, Double renda, double numero_de_funcionarios) {
        super(name, renda);
        this.numero_de_funcionarios = numero_de_funcionarios;
    }

    public double getNumero_de_funcionarios() {
        return numero_de_funcionarios;
    }

    public void setNumero_de_funcionarios(double numero_de_funcionarios) {
        this.numero_de_funcionarios = numero_de_funcionarios;
    }

    public double imposto(){

        double total = 0;

        if (getNumero_de_funcionarios() > 10){
            total = getRenda() * 0.14;
        } else {
            total = getRenda() * 0.16;
        }

        return total;
    }

    public String toString(){
        return "Nome: " + getName() + ". Renda: $" + String.format("%.2f", getRenda()) + ". Imposto total: $" + String.format("%.2f", imposto());
    }
    
}
