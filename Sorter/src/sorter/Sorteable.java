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
public interface Sorteable extends Printable {
    int compare(Sorteable item);
}
