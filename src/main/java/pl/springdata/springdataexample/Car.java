package pl.springdata.springdataexample;

import javax.persistence.*;
import java.awt.*;

//Encja musi spelniac 3 ponizsze warunki:
//Musi posiadac co najmniej jeden bezparametrowy konstruktor.
@Entity
@Table(name = "MyNewCar")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mark;
    private String model;

    @Enumerated(EnumType.STRING)
    private Color color;

    public Car(String mark, String model, Color color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    public Car(){
    }

    public Long getId() {
        return id;
    }
// @Transient - pozwala nam nie uwzglednic czegos w bazie danych, aby nie wypisywac danych
    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}
