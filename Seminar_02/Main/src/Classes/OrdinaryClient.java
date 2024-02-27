package Classes;

import Interfaces.iReturnOrder;
// Класс обычного покупателя (клиента)
public class OrdinaryClient extends Actor implements iReturnOrder {

    // Конструктор
    public OrdinaryClient(String name) {
        super(name);
    }

    // Методы для управления заказами клиента

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

    // Методы для работы с покупателями

    public Actor geActor() {
        return this;
    }

    // Методы для работы с именем покупателя

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    // Реализация интерфейса iReturnOrder

    @Override
    public void returnOrder() {
        System.out.println("Обычный покупатель " + getName() + " возвращает заказ");
        // Логика возврата товара для обычного клиента
    }

    @Override
    public void getReturnInfo() {
        System.out.println("Получение информации о возвращенных товарах для обычного покупателя " + getName() + ".");
        // Логика получения информации о возвращенных товарах для обычного покупателя
    }
}