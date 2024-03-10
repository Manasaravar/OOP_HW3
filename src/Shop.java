public abstract class Shop {
    public abstract void sale();
    public abstract void save();

    private String product;
    private String adress;
    private String typeOfShop;


    public String getProduct() {

        return product;
    }

    public void setProduct(String product) {

        this.product = product;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTypeOfShop() {
        return typeOfShop;
    }

    public void setTypeOfShop(String typeOfShop) {
        this.typeOfShop = typeOfShop;
    }
}
