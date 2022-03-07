package day11.task1;

public class Courier implements Worker {
    private boolean isPayed;
    private int salary;
    private static final int PAYMENT_FOR_COURIER = 100;
    private static final int BONUS = 50000;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.isPayed = false;
        this.salary = 0;
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += PAYMENT_FOR_COURIER;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders()+1);
    }

    @Override
    public void bonus() {
        if((warehouse.getCountDeliveredOrders() >= 10000)&&(isPayed))
            System.out.println("Бонус уже был выплачен");
        else if(warehouse.getCountDeliveredOrders() >= 10000) {
            isPayed = true;
            salary += BONUS;
        }
        else
            System.out.println("Бонус пока не доступен");
    }
}
