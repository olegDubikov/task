package main.java.ru.olegD.en;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус тойота: " + toyota);
        System.out.println("Статус вольво: " + volvo);
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println(order.getId() +" "+ order.getModel() +" "+ order.getStatus().getInfo());
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
        }
    }
}
