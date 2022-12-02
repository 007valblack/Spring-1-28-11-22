package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SumService {
    private int x;
    private int y;
    private int sum;

    public String SumService() {
        int x = 3;
        int y = 4;
        int sum = x + y;

        return ("Cумма чисел: ") + x + (" и ") + y + (" равна ") + sum;
    }
}