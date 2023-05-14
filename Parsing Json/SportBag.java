package org.example;

import java.util.*;

public class SportBag {
    private  List<String> Sports;
    private  boolean WaterProofComp;
    private  boolean AdditionalCover;
    private  Integer Volume;
    private  String Manufacturer;
    private  List<Fabric> OutsideFabric;
    private  List<Fabric> InsideFabric;
    public SportBag() {}
    public SportBag(List<String> sports, boolean waterProofComp, boolean additionalCover,
                    Integer volume, String manufacturer,
                    List<Fabric> outsideFabric, List<Fabric> insideFabric){
        this.Sports = sports;
        this.OutsideFabric = outsideFabric;
        this.InsideFabric = insideFabric;
        this.Volume = volume;
        this.WaterProofComp = waterProofComp;
        this.AdditionalCover = additionalCover;
        this.Manufacturer = manufacturer;
    }
    public List<String> getSports() {
        return Sports;
    }
    public boolean isWaterProofComp() {
        return WaterProofComp;
    }
    public boolean isAdditionalCover() {
        return AdditionalCover;
    }
    public Integer getVolume() {
        return Volume;
    }
    public String getManufacturer() {
        return Manufacturer;
    }
    public List<Fabric> getOutsideFabric() {
        return OutsideFabric;
    }
    public List<Fabric> getInsideFabric() {
        return InsideFabric;
    }

    public void setInsideFabric(List<Fabric> insideFabric) {
        InsideFabric = insideFabric;
    }

    public void setSports(List<String> sports) {
        Sports = sports;
    }

    public void setOutsideFabric(List<Fabric> outsideFabric) {
        OutsideFabric = outsideFabric;
    }

    public void addSport(String sport) {
        Sports.add(sport);
    }
    public void setWaterProofComp(boolean waterProofComp) {
        WaterProofComp = waterProofComp;
    }
    public void setAdditionalCover(boolean additionalCover) {
        AdditionalCover = additionalCover;
    }
    public void setVolume(Integer volume) {
        Volume = volume;
    }
    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }
    public void addOutsideFabric(Fabric fabric) {
        OutsideFabric.add(fabric);
    }
    public void addInsideFabric(Fabric fabric) {
        InsideFabric.add(fabric);
    }

    @Override
    public String toString() {
        return "SportBag {\n" +
                "Sports = " + Sports.toString() + ",\n" +
                "WaterProofComp = " + WaterProofComp +", " +
                "AdditionalCover = " + AdditionalCover +",\n" +
                "Volume = " + Volume +" ," +
                "Manufacturer ='" + Manufacturer + '\'' +",\n" +
                "OutsideFabric = " + OutsideFabric.toString() +",\n" +
                "InsideFabric = " + InsideFabric.toString() +
                "}\n";
    }
}
