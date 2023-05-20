package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.*;
import java.util.Scanner;

public class testuploadfile extends BrowserUtils {

    public static void main(String[] args) throws IOException, InterruptedException {

     Driver.getDriver().get("https://demo.guru99.com/test/upload/");
       WebElement choosefile=Driver.getDriver().findElement(By.xpath("//*[@type='file']"));

        String path;
String pathoffile="src/excelsheett.txt";
        File fil=new File("src/newfile.txt");
        File fil2=new File("excelsheett.txt");

        String d ="";
      /*  if (fil.exists()){
            FileReader flr=new FileReader(pathoffile);
            Scanner sc=new Scanner(fil);
            while(sc.hasNextLine()){



        }else {


        }

        fil.createNewFile();
        fil.setWritable(true);
        FileWriter fl=new FileWriter(fil.getAbsolutePath());

        fl.write("whatsappp\n" +
                "Sacasc\n" +
                "Ask\n" +
                "Ask\n" +
                "As\n" +
                "\n" +
                "Ac\n" +
                "Ac\n" +
                "\n" +
                "\n");
        fl.close();
        System.out.println(d);

      // PrintWriter pw=new PrintWriter(fl);
        //pw.println("Hellow world");
        //pw.close();

        path=fil2.getAbsolutePath();
        System.out.println(path);



        System.out.println(fil.getAbsolutePath());

        choosefile.sendKeys(path);
      Driver.getDriver().findElement(By.id("submitbutton")).click();
       Driver.closeDriver();

        */
      choosefile.sendKeys(uploadtranscrip());
        Driver.getDriver().findElement(By.id("submitbutton")).click();
        Thread.sleep(5000);
        DeleteTranscript(uploadtranscrip());
        Driver.getDriver().close();


    }

    public  static String uploadtranscrip() throws IOException {

        String path="src/transcript.text";
        File f=new File(System.getProperty("user.dir")+path);
        f.setWritable(true);
        f.setReadable(true);
        FileWriter fw=new FileWriter(f.getAbsolutePath());
        String adv="advisorDVISOSEA";
        fw.write("Gkhnkarararar   "+adv+"    asdadasdasdasd");
        fw.close();

        return f.getAbsolutePath();
    }

    public static void DeleteTranscript(String Path){

        File fl=new File(Path);
        fl.delete();
    }


}
