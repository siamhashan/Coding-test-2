package com.odx.test.controller;

import com.odx.test.domain.Demo;
import com.odx.test.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PalindromeController {

    @Autowired
    PalindromeService palindromeService;

    @GetMapping("/test/getsaved/palindromes")
    List<Demo> getPalindromes() {
        return palindromeService.getPalindromes();
    }

    @GetMapping("/save/palindrome/{palindrome}")
    @ResponseStatus(HttpStatus.OK)
    void findAndSavePalindromes(@PathVariable String palindrome) {
        try {
            palindromeService.saveLargestPalindrome(palindrome);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
