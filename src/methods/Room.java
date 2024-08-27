package methods;

import java.util.ArrayList;

public class Room {
    private String name;
    private String description;

    private ArrayList<Guard> guards;

    public Room(String name, String description){
        this.name = name;
        this.description = description;
    }

    // Add guard


    public String toString() {
        StringBuilder roomString = new StringBuilder();
        roomString.append("Room: ").append(name).append("\nDescription: ").append(description).append("\nGuards:\n");

        for (Guard guard : guards) {
            roomString.append(guard.toString()).append("\n");
        }

        return roomString.toString();
    }

}
