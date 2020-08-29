package com.ag04smarts.sha.services;

import org.springframework.stereotype.Service;

@Service("hrLanguageService")
public class CroatianLanguageService implements LanguageService {

    @Override
    public String sayHello() {
        return "Pozdrav iz HR LanguageService-a. Koristimo Qualifiere!";
    }
}
