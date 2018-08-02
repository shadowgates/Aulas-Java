/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

/**
 *
 * @author Tiago Guerino
 */
public class SortedList {

    private Sorteable list[];
    private int count;

    public SortedList(int capMax) {
        list = new Sorteable[capMax];
        count = 0;
    }

    public boolean add(Sorteable item) {
        if (count >= list.length) {
            return false;
        } else {
            list[count] = item;
            count++;
            return true;
        }
    }

    public void sort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (list[i].compare(list[j]) < 0) {
                    Sorteable tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            list[i].print();
        }
    }
}
