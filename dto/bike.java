package dto;


import mylibr.Validation;

public class bike extends Person{
    private String id;
    private String type;

    public bike() {
        super();
        id = null;
        type=null;
    }

    public bike(String name, String gender, int room, String id, String type) {
        super(name, gender, room);
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void inputPerson() {
        super.inputPerson();
        try {
            id = Validation.inputString("[0-9A-Z]{3,5}[-]{1}[.0-9]{3,6}", "");
            type = Validation.inputString(null, "");
        } catch (Exception e) {
            System.out.println("");
        }

    }

}
