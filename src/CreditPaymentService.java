public class CreditPaymentService {
    public double calculate(double summa, double rate, int term) {
        double monthlyPeym = summa *((rate / (100*12) /(1-(1+ Math.pow((1+rate / (12*100)), -(term))))));
        return monthlyPeym;
    }
}
