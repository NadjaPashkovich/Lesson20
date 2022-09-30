package by.itstep.pashka.controller;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,};

        for (int item : array) {
            item *= 2;

        }
        for (int i = 0; i < array.length; i++) {
            array[i] *=2;
        }

        for (int item : array) {
            System.out.print(item + " ");
        }

    }
}
