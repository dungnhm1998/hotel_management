package controllerl.Util.impl;

import java.util.ArrayList;
import java.util.List;
import controller.Util.IDAO;

public class CommonDAO<T> implements IDAO<T> {

    @Override
    public int add(T item) {
        return 0;
    }

    @Override
    public int[] add(Iterable<T> items) {
        return null;
    }

    @Override
    public int update(T item) {
        return 0;
    }

    @Override
    public int remove(T item) {
        return 0;
    }

    @Override
    public int remove(String... conditions) {
        return 0;
    }

    @Override
    public T getOne(String id) {
        return null;
    }

    @Override
    public List<T> getall() {
        return null;
    }

    @Override
    public ArrayList<T> query(String... conditions) {
        return null;
    }

    @Override
    public int[] batch(List<T> items) {
        return new int[0];
    }    
}
