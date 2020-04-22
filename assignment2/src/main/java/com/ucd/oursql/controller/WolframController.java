package com.ucd.oursql.controller;


import com.ucd.oursql.server.WolframAlpha2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


@RestController
public class WolframController {
    @PostMapping(value="/Guest/command")
    public String GetDesText(@RequestParam("command") String text) throws BadPaddingException, UnsupportedEncodingException, IllegalBlockSizeException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException{
        String result= WolframAlpha2.query(text);
        return result;
    }
}
