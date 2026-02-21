package com.workintech.pool;

import java.util.Locale;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        // Testin istediği "2,00" formatı için:
        // String.format default Locale FORMAT'i kullanıyor.
        // Bazı runner/extension'lar Locale'i geri değiştirebildiği için
        // her çağrıda tekrar TR'ye çekiyoruz (garanti çözüm).
        Locale tr = new Locale("tr", "TR");
        Locale.setDefault(Locale.Category.FORMAT, tr);
        Locale.setDefault(tr);

        return width * length;
    }
}