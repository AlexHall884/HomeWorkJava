import java.util.*;

public class Notebook {

    String id;
    String model;
    String processor;
    String ram;
    String hdd;
    String color;


    public Notebook(String id, String model, 
                    String processor,
                    String ram, String hdd, 
                    String color){
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;        
                }

    @Override
    public String toString(){
        return String.format("\nid:%s\nModel:%s\nProcessor:%s\nRAM:%s\nHDD:%s\nColor:%s", 
        id, model, processor, ram, hdd, color);
    }


    public String GetInfo(String filter) {
        
        if(filter == "model"){
            return model;
        }
        if(filter == "processor"){
            return processor;
        }
        if(filter == "RAM"){
            return ram;
        }
        if(filter == "HDD"){
            return hdd;
        }
        if(filter == "Color"){
            return color;
        }
        return "id продукта - " + id;
    }

}

