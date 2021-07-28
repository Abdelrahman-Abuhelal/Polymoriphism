public class Linux extends OperatingSystem{
    private String dist;

    public Linux() {
        super("Linux","UnKnown");
        this.dist="UnKnown";
    }

    public Linux(String pversion,String dist) {
        super("Linux",pversion);
        this.dist=dist;
    }

    @Override
    public void printOsInfo() {
    super.printOsInfo();
    System.out.println("the distribution is "+this.dist);
    }
}
