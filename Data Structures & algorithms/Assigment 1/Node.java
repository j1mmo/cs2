/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads2library;

/**
 *
 * @author b8045796
 */
public class Node {
    public Book book;
    public Node next;
    public Node prev;
    public Node(){
        this.book = null;
        next = null;
        prev = null;
    }
    public Node(Book book){
        this.book = book;
        next = null;
        prev = null;
    }
    public int getNumberOfItems() {
        if (next == null)
            return 0;
        else
            return ( 1 + next.getNumberOfItems());
    }
    public Book findBook(String isbn){
        if(book == null||book.getIsbn().equals(isbn)){
            return book;
        }else{
            return prev.findBook(isbn);
        }
    }
    public Node findIndex(int index){
        if(this.next == null || index == 0)
            return this;
        else{
            return this.next.findIndex(index - 1);
        }
    }
    
}
