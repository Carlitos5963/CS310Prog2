package data_structures;

import data_structures.*;

public class P2Driver {
    private Stack<Integer> list;
    private static final int MAX_SIZE = 1000000;
    
    public P2Driver() {
        list = new Stack<Integer>();
        runTests();
        }
        
    private void runTests() {
try{    
        for(int i=100; i > 0; i--) 
            list.push(i);
        print("1 Should print 1 .. 100");
        print();
        for(int i=101; i <= 200; i++)
            list.push(i);
        print("2 Should print 1 .. 200");
        print();
        System.out.println(list.peek());
        for(int i=101; i <= 200; i++)
            list.push(i);
        list.remove(60);
        list.remove(61);
        list.remove(62);
        list.remove(63);
        list.remove(64);
        list.remove(65);
        print();
             
}
catch(Exception e) {
    System.out.println("24 In third catch block");
    e.printStackTrace();
    }                            
       }
       
    private void print(String s) {
        System.out.println(s);
        }
       
    private void print() {
        for(Integer i : list)
            System.out.print(i + " ");
        System.out.println();
        }
        
    public static void main(String [] args) {
        new P2Driver();
        }
    }