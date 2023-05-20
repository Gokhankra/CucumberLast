package code.pages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class systemfiles {


    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(System.getProperty("user.dir"));
        String file=System.getProperty("user.dir");
        String path=file+"/src/cmakc.txt";
        File f =new File(path);
        f.createNewFile();
        f.setWritable(true);
        f.setReadable(true);
        FileWriter fl=new FileWriter(f);
        fl.write("nckasnckasncknascnkasnckkcnas as\n \n\n "+
                "= asdaksn ckasc as");
        fl.close();




        String n="Testad, Tstar";
String g="";

        g=n.substring(n.indexOf(" "))+" "+n.substring(0,n.indexOf(","));
            g=g.trim();

        System.out.println(g);
        Thread.sleep(5000);
       // delete(path);

    }

    public static void delete(String p){
        File file=new File(p);
        file.delete();
    }

}
