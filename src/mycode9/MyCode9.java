/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode9;

/**
 *
 * @author LENOVO
 */


    /**
     * @param args the command line arguments
     */
    
      class Square {
    int length;
    Square sq;
    
    Square(int length) {
        this.length = length;
    }
    
    void setInner(Square sq) {
        this.sq = sq;
    }
    
    int getLength() {
        return this.length;
    }
}
 
public class MyCode9 {
    public static void main(String[] args) {
        Square sq1 = new Square(10); //Line n1
        Square sq2 = new Square(5); //Line n2
        sq1.setInner(sq2); //Line n3
        System.out.println(sq1.sq.length); //Line n4
    }
    }
    

