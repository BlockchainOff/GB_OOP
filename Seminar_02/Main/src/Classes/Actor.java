package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    
    //Имя покупателя.
     
    protected String name;
    
    //Флаги
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    //Конструктор

    public Actor(String name) {
        this.name = name;
    }

    //Метод для получения имени покупателя
    public abstract String getName();

    //метод для установки имени покупателя
    public abstract void setName(String name);
}
