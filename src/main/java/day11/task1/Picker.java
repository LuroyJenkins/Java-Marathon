package day11.task1;

public class Picker implements Worker {
    private boolean isPayed;
    private int salary;
    private static final int PAYMENT_FOR_PICKER =  80;
    private static final int BONUS = 70000;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.isPayed = false;
        this.salary = 0;
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += PAYMENT_FOR_PICKER;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders()+1);
    }

    @Override
    public void bonus() {
        if((warehouse.getCountPickedOrders() >= 10000)&&(isPayed))
            System.out.println("Бонус уже был выплачен");
        else if(warehouse.getCountPickedOrders() >= 10000) {
            isPayed = true;
            salary += BONUS;
        }
        else
            System.out.println("Бонус пока не доступен");
    }
}
