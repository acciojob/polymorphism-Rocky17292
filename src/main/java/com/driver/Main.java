package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int a = p.product(1,2);
        int b = p.product(12,2,2);
        double c = p.product(1.0,2.0);
    }

    static class  Product{

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public int product(int x, int y) {
            return x * y;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }
}