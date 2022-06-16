package ru.netology.SQRService;

public class SQRService {

    public int calcService(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min) {
                if (sqr <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}
