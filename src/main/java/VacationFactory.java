interface Vacation { }

abstract class VacationFactory {
    // FactoryMethod
    public abstract Vacation factoryMethod();
}

class PaidVacation extends VacationFactory implements Vacation {

    @Override
    public Vacation factoryMethod() {
        return new PaidVacation();
    }
}
class UnpaidVacation extends VacationFactory implements Vacation {

    @Override
    public Vacation factoryMethod() {
        return new UnpaidVacation();
    }
}
class SickDay extends VacationFactory implements Vacation {

    @Override
    public Vacation factoryMethod() {
        return new SickDay();
    }
}
class SickLeave extends VacationFactory implements Vacation {

    @Override
    public Vacation factoryMethod() {
        return new SickLeave();
    }
}

class FactoryMethodExample {
    public static void main(String[] args) {
        VacationFactory[] vacationFactories ={new PaidVacation(), new UnpaidVacation(), new SickDay(), new SickLeave()};
        for (VacationFactory vacationtype : vacationFactories) {
            Vacation vacation = vacationtype.factoryMethod();
            System.out.printf("Created {%s}\n", vacation.getClass());
        }

    }

}







