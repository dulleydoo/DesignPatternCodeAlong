package HW2.designpatterns.abstractfactory;

public class AmexPlatinumValidator implements Validator {


    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
