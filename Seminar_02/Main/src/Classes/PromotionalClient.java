package Classes;


public class PromotionalClient extends OrdinaryClient {

    // Добавляем дополнительные поля
    private String stockName; // Название акции
    private int clientId; // ID покупателя
    private static int numberOfParticipants; // Поле статическое для хранения общего количества участников в акции.

    public PromotionalClient(String name, String stockName, int clientId) {
        super(name);
        this.stockName = stockName;
        this.clientId = clientId;
        // Увеличиваем общее количество участников в акции при создании нового акционного покупателя.
        numberOfParticipants++;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getClientId() {
        return clientId;
    }


    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    // Геттер для статического поля numberOfParticipants
    public static int getNumberOfParticipants() {
        return numberOfParticipants;
    }
}