package entities;

public class PessoaFisica extends Contribuinte {
    
    private double gastos_com_saude;

    public PessoaFisica(String name, Double renda, double gastos_com_saude) {
        super(name, renda);
        this.gastos_com_saude = gastos_com_saude;
    }

    public double getGastos_com_saude() {
        return gastos_com_saude;
    }

    public void setGastos_com_saude(double gastos_com_saude) {
        this.gastos_com_saude = gastos_com_saude;
    }

    public double imposto(){

        double total = 0;

        if (getRenda() >= 20000){
            total += getRenda() * (0.25);
        } else {
            total += getRenda() * (0.15);
        }

        if (getGastos_com_saude() >= 2000){
            total -= (getGastos_com_saude() * 0.5);
        }

        return total;
    }

    public String toString(){
        return "Nome: " + getName() + ". Renda: $" + String.format("%.2f", getRenda()) + ". Imposto total: $" + String.format("%.2f", imposto());
    }

}
