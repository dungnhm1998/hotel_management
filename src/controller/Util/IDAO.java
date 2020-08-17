/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Util;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface IDAO<T> {

    int add(T item);

    int[] add(Iterable<T> items);

    int update(T item);

    int[] batch(List<T> items);

    int remove(T item);

    int remove(String... conditions);

    T getOne(String id);

    List<T> getall();

    List<T> query(String... conditions);

}
