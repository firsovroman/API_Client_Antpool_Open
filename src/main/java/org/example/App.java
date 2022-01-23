package org.example;

import org.apache.commons.codec.binary.Hex;
import org.example.configuration.MyConfig;
import org.example.entity.Example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;


public class App 
{
    public static void main( String[] args ) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);


        String apiKey = "******";
        String apiSecret = "******";
        Long nonce = System.currentTimeMillis();
        String userId = "*******";


        String sign = apiSignature(userId, apiKey, nonce.toString(), apiSecret);

        //результат
        Example result = communication.postMethod(apiKey, nonce.toString(), sign);



        int activeWorkers = result.getData().getActiveWorkers();
        Double hour = Double.parseDouble(result.getData().getLast1h()) / 1000000;
        Double day = Double.parseDouble(result.getData().getLast1d()) / 1000000;


        if (activeWorkers == 0) {
            System.out.println("Воркер не активен!");
        }

        System.out.println("Last hour : " + hour + " Th/s");
        System.out.println("Last day : " + day + " Th/s");
    }



    public static String apiSignature(String userId, String key, String nonce, String secret) throws Exception {
        String data = userId+key+nonce;
        Mac hmacSha256 = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
        hmacSha256.init(secretKey);
        return Hex.encodeHexString(hmacSha256.doFinal(data.getBytes())).toUpperCase();
    }


}
