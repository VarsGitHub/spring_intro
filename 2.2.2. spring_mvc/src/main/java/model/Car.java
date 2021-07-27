package model;

public class Car {
    private final String firm;
    private final int horsePower;
    private final int series;

    public Car(String firm, int horsePower, int series) {
        this.firm = firm;
        this.horsePower = horsePower;
        this.series = series;
    }

    public String getFirm() {
        return firm;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getSeries() {
        return series;
    }
}
