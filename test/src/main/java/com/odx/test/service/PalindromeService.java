package com.odx.test.service;

import com.odx.test.domain.Demo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PalindromeService {
    void saveLargestPalindrome(String palindrome) throws Exception;

    List<Demo> getPalindromes();
}
