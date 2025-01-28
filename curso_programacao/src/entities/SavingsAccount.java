package entities;

public final class SavingsAccount extends Account{
    
    private double interestRate;

    public SavingsAccount(){}

    public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override // nao necessário mas ajuda bastante
    public void withdraw(double amount){
        balance -= amount; //withdrawl sem taxa! override (se ouvesse final metodo nao pode ser sobreposto)
    }

}
