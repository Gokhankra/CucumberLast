package code;

import code.utils.Driver;

import javax.sound.midi.SysexMessage;
import java.io.File;

public class test {


    public static void StaticWait(int seconds){
        try {
            Thread.sleep(1000*seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File drivergk=new File(System.getProperty("user.dir")+"/driver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",drivergk.getAbsolutePath());
        System.out.println(drivergk.getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));
    }

    public  void main() {
        System.out.println("hello class");
    }


}
