package utilities;

import pojos.Appointements2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToTxt2 {


    public static void saveAppointementData(Appointements2[] appointements ) {
        try {
            String yol="src/test/resources/testdata/appointement2.txt";
            FileWriter write=new FileWriter(yol,false);
            /*
            FileWrite da iki sey var dikkat edilecek once yol eklenir,
            yanina true yatazsak uzerine yazdirir, tekrar tekrar-->hergun ui den yeni data olusturdugumuzda her gun yeni data olturdugumuzda daha faydalidir
            fale yaparsak oncesini siler yenisini alir

            FileWrite bizim icin sadece dosya olsuutrur

            BufferredWriter ise oluturulan dosyayinin icine yazmamizi saglar
             */

            BufferedWriter bw=new BufferedWriter(write);

            for (int i = 0; i < appointements.length; i++) {
                bw.append(appointements[i]+"\n");//burada butun appimentlari yadririr

            }
            //bw.append(appointements[0]+"/n");-->sadece bir objec yazdirir
            bw.close();

        }catch (Exception e){
            e.printStackTrace();

        }



    }


}
