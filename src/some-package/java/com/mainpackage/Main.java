package com.mainpackage;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class Main {

    public static void main(String[] argv) {
        String message = argv[0];
        String key = argv[1];
        Cipher cipher = Cipher.getInstance("RSA");
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        System.out.println(String(cipher.doFinal(message.getBytes()), StandardCharsets.UTF_8));

    }
    
}
