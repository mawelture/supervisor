package com.mx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@RequestMapping("/lan")
public class LANController {

    @RequestMapping("/host")
    @ResponseBody
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
