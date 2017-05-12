package com.company;

/**
 * Created by RENT on 2017-05-12.
 */
public class OutOfBounds {
    String[] lista = new String[10];

    public OutOfBounds() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = i + "new string";
        }
    }

    public String getItemFromList(int index) {
        if (index < 0 || index > lista.length) {
            throw new IndexOutOfBoundsException();
        }
        return lista[index];
    }

}
