package methods;

public class Guard {

    private String name;
    private String description;
    private Room room;

    public Guard(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void setRoom(Room room){
        this.room = room;
    }

    public String inspectString(){
        return "The Guard name : " + name + "\n" + "Description : " + description;
    }

    public String toString(){
        return inspectString();
    }
}
