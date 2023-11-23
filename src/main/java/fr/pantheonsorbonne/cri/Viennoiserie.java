public abstract class Viennoiserie {

    private double poids;
    private double price;

    public Double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Viennoiserie(double poids, double price) {
        this.poids = poids;
        this.price = price;
    }

    public abstract String dipInCoffee();

}
