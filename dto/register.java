package dto;

import mylibr.Validation;

public class register {
    private String card;

    public register() {
        card=null;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void inputCard(){
        try {
            card = Validation.inputString(null,"nhap card");
        }catch (Exception e){
            System.out.println("loi");
        }
    }
}
