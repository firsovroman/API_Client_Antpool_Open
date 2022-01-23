package org.example;


import org.example.entity.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "https://antpool.com/api/hashrate.htm";

    public Example postMethod(String apiKey, String nonce, String sign) {

        Example result = restTemplate.getForObject("https://antpool.com/api/hashrate.htm?key={apiKey}&nonce={nonce}&signature={sign}&coin=BCH&userId=myId",
                Example.class,apiKey, nonce, sign);
        System.out.println("Ответ от сервера: " + result);

        return result;

    }

}
