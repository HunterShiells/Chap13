
package ClassExamples;

import java.util.*;

public class ListIteratorEx1 {
    
    static ArrayList<String> al = new ArrayList();
    static ListIterator li;
    static int pos = 0;
    
    public static void main(String[] args) {
        al.add("a");
        al.add("b");
        al.add("c");
        //make iterator
        li = al.listIterator();
        showList();
        System.out.println("Moving over " + li.next());
        pos++;
        showList();
        //move 2
        System.out.println("Moving over " + li.next());
        pos++;
        showList();
        //remove b
        System.out.println("Removing b");
        li.remove();
        pos--;
        showList();
        //adding back b
        System.out.println("Adding b");
        li.add("b");
        pos++;
        showList();
        //moving over
        System.out.println("Moving over " + li.next());
        pos++;
        showList();
        //going back
        System.out.println("Moving over " + li.previous());
        pos--;
        showList();
        //removing
        System.out.println("Removing last thing travelled over");
        li.remove();
        showList();
        //going back 
        System.out.println("Moving over " + li.previous());
        pos--;
        showList();
        //override
        System.out.println("Replacing previous travelled over");
        li.set("e");
        showList();
        //adding b back in 
        System.out.println("Adding b");
        li.add("b");
        pos++;
        showList();
        //adding c
        System.out.println("Adding c");
        li.add("c");
        pos++;
        showList();
        //throw a remove error due to nothing travelled over
        //System.out.println("throw a remove error due to nothing travelled over");
        //li.remove();
        //showList();
        //move to the next one
        System.out.println("Moving over " + li.next());
        pos++;
        showList();
        //throw an error due to it not being able to go and further
        //System.out.println("Moving over " + li.next());
        //pos++;
        //showList();
        
    }

    public static void showList() {
        for (int i = 0; i < al.size(); i++) {
            if(i==pos) System.out.print("*");
            System.out.print(al.get(i));
        }
        if(pos== al.size()) System.out.print("*");
        System.out.println("");
    }
    
}
