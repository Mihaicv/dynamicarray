package com.codecool.dynamicarray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
    private int[] array;
    private int size = 0;


    public DynamicArray(int capacity) {
        this.array = new int[capacity];
    }

    public DynamicArray() {
        this.array = new int[4];
    }

    public int getCapacity() {
        return array.length;
    }

    public int size() {
        return this.size;
    }

    public void add(int value) {
        int[] dubleSpace;
        this.array[size] = value;
        this.size++;

        if (getCapacity() >= size) {
            dubleSpace = new int[getCapacity() * 2];

            if (size >= 0)
                System.arraycopy(array, 0, dubleSpace, 0, size);

            array = dubleSpace;
        }
    }

    public int get(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("Index > 0");
        }
        return array[index];
    }

    public void remove(int indexToBeRemoved) {
        List<Integer> lista = new ArrayList<>();
        int[] temp;

        if (indexToBeRemoved < 0) {
            throw new ArrayIndexOutOfBoundsException("Index > 0");
        }else if (indexToBeRemoved >= size) {
            throw new ArrayIndexOutOfBoundsException("Index > array length");
        }
        for (int i : array) {
            lista.add(i);
        }
        lista.remove(indexToBeRemoved);
        size--;
        array = lista.stream().mapToInt(i -> i).toArray();

    }
    public void insert(int index, int newValue) {
        List<Integer> lista = new ArrayList<>();
        int[] temp;

        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index is less than");
        } else if (index >= size) {
            temp = new int[size * 2 - 1];
            if (size >= 0)
                System.arraycopy(array, 0, temp, 0, size);
            array = temp;

        }
        for (int i : array) {
            lista.add(i);
        }
        lista.add(Math.min(size, index), newValue); // l.add(size < index ? size : index, newValue);  Explain:if size<index,add size, else add index,value
        size++;
        array = lista.stream().mapToInt(i -> i).toArray();
    }

    @Override
    public String toString() {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < size; i++)
            lista.add(array[i]);
        return Arrays.toString(lista.toArray());
    }
}
