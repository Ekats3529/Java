package org.example;



import java.util.*;

public class Pizza implements Cloneable{

    private Map<String, Integer> Ingridients;
    private String name;

    public Pizza(){
        Ingridients = new HashMap<>();
    }

    public Pizza(String name, Map<String, Integer> list){
        this.Ingridients=list;
        this.name = name;
    }

    public Pizza(Map<String, Integer> list){
        this.Ingridients=list;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addIng(String name, Integer price) throws IllegalArgumentException{
        if (price <= 0){
            throw new IllegalArgumentException("Price of ingridient must be more than 0");
        }
        Ingridients.put(name, price);
    }

    public void removeIng(String name){
        Ingridients.keySet().remove(name);
    }


    public void MakeDefault(){
        Ingridients.clear();
        Ingridients.put("tomato souse", 15);
        Ingridients.put("cheese", 30);
    }

    public StringBuilder getIngridients() {
        StringBuilder res = new StringBuilder();
        for(Map.Entry<String, Integer> entry: Ingridients.entrySet()) {
            res.append(entry.getKey());
            res.append("\n");
        }
        return res;
    }


    public Map<String, Integer> getIngridientsMap() {
        return Ingridients;
    }

    public Integer getPrice() {
        Integer res = 0;
        for(Map.Entry<String, Integer> entry: Ingridients.entrySet()) {
            res += entry.getValue();
        }
        return res;
    }

    public StringBuilder getInfo() throws IllegalArgumentException{

        StringBuilder res = new StringBuilder();
        res.append("---------------------------------------\n");
        res.append("Pizza name: " + name + "\n");
        if (Ingridients.size() == 0){
            throw new IllegalArgumentException("Count of ingridients must be more than 0");
        }
        for(Map.Entry<String, Integer> entry: Ingridients.entrySet()) {
            res.append(entry.getKey() + "  " + Integer.toString(entry.getValue()) + "\n");
        }
        res.append("Total: " + Integer.toString(getPrice()) + "\n");
        res.append("---------------------------------------\n");
        return res;
    }


    @Override
    public Object clone() throws CloneNotSupportedException{
        Map<String, Integer> temp = new HashMap<>();
        temp.putAll(Ingridients);
        return new Pizza(temp);
    }

}
