package Interfaces;

import Classes.Actor;

 //Интерфейс, определяющий поведение покупателя в магазине.
 
public interface iActorBehaviour {

    // Проверяет, принимает ли покупатель заказ.
     
    public boolean isTakeOrder();

    
     //Проверяет, делает ли покупатель заказ.
     
    public boolean isMakeOrder();

    
    //Устанавливает состояние принятия заказа для покупателя.
     
    public void setTakeOrder(boolean val);

    
    //Устанавливает состояние создания заказа для покупателя.
     
    public void setMakeOrder(boolean val);
    
     //Возвращает объект покупателя.
     
    public Actor geActor();
}