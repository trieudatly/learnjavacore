package edu.poly.slide3;

public class TrungBinh {

    public static void main(String[] args) {
        int i = 27;//i->270
        int sum = 0, count = 0;
        while (i <= 270) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        float avg = (float) sum / count;
        System.out.printf("Tong so cac so chia het cho 3: %d\n", count);
        System.out.printf("Tong cac so: %d-Trung binh cac so: %f", sum, avg);
    }
}
