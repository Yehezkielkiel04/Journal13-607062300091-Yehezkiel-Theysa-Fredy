public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        char[] elements = {'F', 'E', 'H', 'D', 'G', 'C', 'B', 'H', 'K', 'J'};

        for (char element : elements) {
            bst.insert(element);
        }

        boolean searchK = bst.search('K');
        boolean searchA = bst.search('A');

        System.out.println("Inorder traversal:");
        bst.inorder();
        System.out.println();

        System.out.println("Preorder traversal:");
        bst.preorder();
        System.out.println();

        System.out.println("Postorder traversal:");
        bst.postorder();
        System.out.println();

        System.out.println("Hasil pencarian untuk 'K': " + (searchK ? "Ditemukan" : "Tidak ditemukan"));
        System.out.println("Hasil pencarian untuk 'A': " + (searchA ? "Ditemukan" : "Tidak ditemukan"));
    }
}