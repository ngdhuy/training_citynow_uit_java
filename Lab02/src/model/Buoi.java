package model;

public class Buoi {
    private int ID;
    private String Ten;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTen() {
        this.setTen();
        return Ten;
    }

    /**
     *
     * @param ten is the name of Buoi
     */
    public void setTen(String ten) {
        Ten = ten;
    }

    @Override
    public String toString(){
        return ID + " - " + Ten;
    }
}
