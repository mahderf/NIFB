package nifb.me.nifb.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Nifb {

    @NotNull
    @Min(10)
    @Max(1000)
   private long number;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
    @NotNull
    @Size(min=3)
    private String name;
    private String fizzBuzz=null;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
