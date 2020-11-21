package mehmetbaykal.odev2;

public class Factory {
    private String modelName;
    private String imei;
    private String version;
    private int ram;
    private float inc;


    public void call(){
        System.out.println("I can call");
    }

    public void sendSms(){
        System.out.println("I can send sms");
    }



    //getter and setter for encapsulation
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getImei() {
        return imei;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getInc() {
        return inc;
    }

    public void setInc(float inc) {
        this.inc = inc;
    }
}
