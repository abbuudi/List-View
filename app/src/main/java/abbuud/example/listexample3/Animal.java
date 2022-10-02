package abbuud.example.listexample3;

public class Animal {
    private String type;
    private int picId;

    public Animal(String type, int id) {
        this.type = type;
        this.picId = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int id) {
        this.picId = id;
    }
}
