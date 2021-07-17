package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    public Car() {
    }

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    @OneToOne(mappedBy = "car")
    private User user;

    public Long getId() {
        return id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }
}
