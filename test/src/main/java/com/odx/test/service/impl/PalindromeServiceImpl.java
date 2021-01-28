package com.odx.test.service.impl;

import com.odx.test.domain.Demo;
import com.odx.test.repository.PalindromeRepository;
import com.odx.test.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PalindromeServiceImpl implements PalindromeService {

    @Autowired
    PalindromeRepository repository;

    @Override
    public void saveLargestPalindrome(String palindrome) throws Exception {
            // get length of input String
            int n = palindrome.length();

            // All subStrings of length 1
            // are palindromes
            int maxLength = 1, start = 0;
            int flag = 0;
            // Nested loop to mark start and end index
            for (int i = 0; i < palindrome.length(); i++) {
                for (int j = i; j < palindrome.length(); j++) {
                     flag = 1;

                    // Check palindrome
                    for (int k = 0; k < (j - i + 1) / 2; k++)
                        if (palindrome.charAt(i + k) != palindrome.charAt(j - k))
                            flag = 0;

                    // Palindrome
                    if (flag!=0 && (j - i + 1) > maxLength) {
                        start = i;
                        maxLength = j - i + 1;
                    }
                }
            }
            if(flag != 0 ){
                System.out.print("Longest palindrome subString is: ");
                repository.save(new Demo(palindrome.substring(start, start + maxLength)));
            }else{
                throw new Exception("String is not a palindrome");
            }

    }

    @Override
    public List<Demo> getPalindromes() {
        return repository.findAll();
    }
}
