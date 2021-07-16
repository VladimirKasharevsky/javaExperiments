public class Tree {
    public static void main(String[] args) {


        Node root =
                new Node(20,
                        new Node(7,
                                new Node(4, null, new Node(6)), new Node(9)),
                        new Node(35,
                                new Node(31, new Node(28), null),
                                new Node(40, new Node(38), new Node(52))));

//        System.out.println("Сумма дерева: " + root.sum());
    }



 static class Node {
    int value;
    Node left;
    Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

     public Node(int value) {
         this.value = value;
     }

//     https://github.com/Arhiser/java_tutorials/blob/master/src/ru/arhiser/tree1/tree.java
}