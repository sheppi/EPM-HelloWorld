package com.epam.client.entity;

import com.epam.client.entity.commands.Command;

import java.util.HashMap;

/**
 * Created by Kirill_Kaluga on 6/16/2016.
 */
public class Client {
    private static Client uniqueInstance;
    private HashMap<String, Command> commands;

    private Client() {}

    public static Client getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Client();
        }
        return uniqueInstance;
    }

}
