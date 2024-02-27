package Classes;

import Interfaces.iReturnOrder;

public class SpecialClient extends Actor implements iReturnOrder {

    public SpecialClient(String name, int idVIP) {
        super(name);
    }

    // Методы для управления заказами покупателя

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor geActor() {
        return this;
    }

    // Реализация метода getName() из класса Actor

    public String getName() {
        return super.name;
    }

    // Реализация метода setName(String) из класса Actor

    @Override
    public void setName(String name) {
        super.name = name;
    }

    // Реализация интерфейса iReturnOrder

    @Override
    public void returnOrder() {
        System.out.println("Особый покупатель " + getName() + " возвращает товар.");
        // Логика возврата товара для специального клиента
    }

    @Override
    public void getReturnInfo() {
        System.out.println("Получение информации о возвращенных товарах для особого клиента " + getName() + ".");
        // Логика получения информации о возвращенных товарах для специального клиента
    }
}