package com.epam.client.entity;

/**
 * Created by Kirill_Kaluga on 6/16/2016.
 */
public class Client {
    private static Client uniqueInstance;

    private Client() {}

    public static Client getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Client();
        }
        return uniqueInstance;
    }

}
