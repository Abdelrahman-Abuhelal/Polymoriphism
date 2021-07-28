public class OperatingSystem {
    private String name;
    private String version;

    public OperatingSystem(){
        this.name="None";
        this.version="None";
    }

    public OperatingSystem(String pname, String pversion) {
        this.name = pname;
        this.version = pversion;
    }
    public void printOsInfo(){
        System.out.println("OS: "+ this.name +"  version: "+this.version);
    }

}
