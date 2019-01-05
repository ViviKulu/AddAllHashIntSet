package com.company;

public class Main {

    // Write a method named addAll that could be placed inside
    // the HashIntSet class. This method accepts another HashIntSet
    // as a parameter and adds all elements from that set into the
    // current set, if they are not already present. For example,
    // if a set s1 contains [1, 2, 3] and another set s2 contains
    // [1, 7, 3, 9], the call of s1.addAll(s2); would change s1 to
    // store [1, 2, 3, 7, 9] in some order.
    //
    // You are allowed to call methods on your set and/or the other set.
    // Do not modify the set passed in. This method should run in O(N)
    // time where N is the number of elements in the parameter set passed in.

    public static void main(String[] args) {
	// write your code here
        HashIntSet s1 = new HashIntSet();

        s1.add(1);
        s1.add(2);
        s1.add(3);

        HashIntSet s2 = new HashIntSet();

        s2.add(1);
        s2.add(7);
        s2.add(3);
        s2.add(9);

        s1.addAll(s2);

        System.out.println(s1);
    }

}
