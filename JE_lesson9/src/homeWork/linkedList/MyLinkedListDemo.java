package homeWork.linkedList;

public class MyLinkedListDemo {

    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);

        System.out.println("Looking for added myLinkedList elements:");
        System.out.println(myLinkedList);
        System.out.println();

        System.out.println("Now, we are got some elements:");
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));

        System.out.println("Lets remove the element on index (1):");
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        System.out.println("Nice, we just deleted " + "number 2" + "con index (1)");

        System.out.println(myLinkedList.contains(1));

    }
}
