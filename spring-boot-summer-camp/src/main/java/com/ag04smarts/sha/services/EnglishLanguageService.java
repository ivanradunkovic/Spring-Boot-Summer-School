package com.ag04smarts.sha.services;

import org.springframework.stereotype.Service;

@Service("enLanguageService")
public class EnglishLanguageService implements LanguageService {

    @Override
    public String sayHello() {
        return ("Hello from EN LanguageService. Using Qualifiers");
    }
}
