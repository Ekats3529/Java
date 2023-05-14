package org.example;

public class Fabric {
    private String name;
    private Integer cost;
    public Fabric() {}

    public Fabric(String name, Integer cost){
        this.cost = cost;
        this.name = name;
    }
    public Integer getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fabric{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
