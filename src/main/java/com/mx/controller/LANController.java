package com.mx.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LANController {


    public String getLocalHost() {
        String address = "0.0.0.0";
        try {
            InetAddress addr = InetAddress.getLocalHost();
            address = addr.getHostAddress();
        } catch (UnknownHostException e) {

        }

        return address;
    }
}
