public class Main {
    public static void main(String[] args) {
        pohon intTree = new pohon();

        intTree.insert(20);
        intTree.insert(55);
        intTree.insert(30);
        intTree.insert(15);
        intTree.insert(17);
        intTree.insert(5);
        intTree.insert(99);
        intTree.insert(2);

        intTree.traverseInorder();

        System.out.println(intTree.get(55));
        System.out.println(intTree.get(99));

        System.out.println(intTree.max());
        System.out.println(intTree.min());
    }
}