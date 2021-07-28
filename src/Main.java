import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void printOs(OperatingSystem os){
        os.printOsInfo();
    }

    public static void main(String[] args) {
    Windows win1=new Windows("7");
    Mac mac1=new Mac("IOS_9");
    Linux linux1=new Linux("SA-8.1","sdk2");

    printOs(win1);
    printOs(mac1);
    printOs(linux1);

    }
    }

