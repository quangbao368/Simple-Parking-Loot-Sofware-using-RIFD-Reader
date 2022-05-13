package dto;
import mylibr.Validation;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String gender;
    private int room;

    public Person( String name, String gender, int room) {
        this.name = name;
        this.gender = gender;
        this.room = room;
    }
    public Person() {
        name=null;
        gender="male";
        room=0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void inputPerson(){
        try {
            name = Validation.inputString(null, "ho va ten: ");
            gender = Validation.inputString(null, "nam hay nu: ");
            room = Validation.inputNumber("lon_hon_hoac_bang", "0", "so phong: ");
        } catch (Exception e) {
            System.out.println("");
        }
    }
    public void outputPerson(){

    }
}
