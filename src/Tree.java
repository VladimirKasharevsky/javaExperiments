import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    public static void main(String[] args) {


        Node root =
                new Node(20,
                        new Node(7,
                                new Node(4, null, new Node(6)), new Node(9)),
                        new Node(35,
                                new Node(31, new Node(28), null),
                                new Node(40, new Node(38), new Node(52))));

        System.out.println("Сумма дерева: " + root.sum());
        System.out.println("Сумма дерева: " + sumDeep(root));
    }

//Объект дерево
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

    //Сумма всех элементов
        public int sum() {
            int summ = value;

            if (left != null) {
                summ += left.sum();
            }

            if (right != null) {
                summ += right.sum();
            }
            return summ;
        }
    }

    public static int sumDeep(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        int summ = 0;

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            System.out.println(node.value);

            summ = summ + node.value;

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return summ;
    }

    public static int sumWide(Node root) {
        Queue<Node> stack = new PriorityQueue<>();
        stack.add(root);

        int summ = 0;

        while (!stack.isEmpty()) {
            Node node = stack.poll();

            System.out.println(node.value);

            summ = summ + node.value;

            if (node.right != null) {
                stack.add(node.right);
            }

            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return summ;
    }
}
