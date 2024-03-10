public class Warehouse extends Shop {
    @Override
    public void sale() {

        System.out.println("Продажа товара");
    }
    @Override
    public void save() {

        System.out.println("Хранение товара");
    }

    @Override
    public String toString() {
        return "Тип магазина: " + this.getTypeOfShop() + ", адрес магазина: " + this.getAdress();
    }
}
