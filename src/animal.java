public abstract class animal {
    protected double weight;
    public animal() {
        weight = 0;
    }

    public double eat(double food) {
        weight += food;
        return weight;
    }
    public abstract String speak();
    public abstract String attack();
    public String getTreat() {
        return "Treat";
    }

}
