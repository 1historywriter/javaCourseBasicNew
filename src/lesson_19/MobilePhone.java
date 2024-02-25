package lesson_19;

public class MobilePhone {
    private int imeiid;

    private String name;
    private String group;
    private String pin;

    public MobilePhone(int imeiid) {
        this.imeiid = imeiid;
        this.name = name;
        this.group = group;
        this.pin = pin;
    }
    public int getImeiid() {return imeiid; }

    public String getName(){ return name; }

    public String getGroup () {return group; }

    public void setGroup(String group) { this.group = group; }

    public void changePin(String newPin){
        this.pin = newPin;
    }

    public void printPhoneData(){
        System.out.println("imeiid: ");
        System.out.println("name");
    }
}