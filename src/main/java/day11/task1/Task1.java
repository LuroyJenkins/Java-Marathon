package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        // 1й склад и 2 сотрудника
        Warehouse warehouse1 = new Warehouse();
        Picker picker_1 = new Picker(warehouse1);
        Courier courier_1 = new Courier(warehouse1);
        businessProcess(picker_1);
        businessProcess(courier_1);
        System.out.println(warehouse1.getCountPickedOrders());
        System.out.println(warehouse1.getCountDeliveredOrders());
        System.out.println(picker_1.getSalary());
        System.out.println(courier_1.getSalary());

        // 2й склад и 2 сотрудника
        Warehouse warehouse2 = new Warehouse();
        Picker picker_2 = new Picker(warehouse2);
        Courier courier_2 = new Courier(warehouse2);
        picker_2.doWork();
        courier_2.doWork();

    }

    static void businessProcess(Worker worker){
        for (int i = 0; i <= 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
