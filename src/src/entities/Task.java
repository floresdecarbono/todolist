package entities;

import java.util.Date;

public class Task {

    private long id;
    private String name;
    private String description;
    private Date prize;

    public Task(long id, String name, String description, Date prize) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.prize = prize;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPrize() {
        return prize;
    }

    public void setPrize(Date prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return id + " - "
                + name + " - "
                + prize + "\n"
                + description;
    }

}
