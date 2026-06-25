

// public class BinaryTreeArrayMain23 {
//     public static void main(String[] args) {

//         BinaryTreeArray23 bta = new BinaryTreeArray23();

//         Mahasiswa23 m1 = new Mahasiswa23("244162321", "Ali", "A", 3.57);
//         Mahasiswa23 m2 = new Mahasiswa23("244162385", "Candra", "C", 3.41);
//         Mahasiswa23 m3 = new Mahasiswa23("244160221", "Badar", "B", 3.75);
//         Mahasiswa23 m4 = new Mahasiswa23("244160220", "Dewi", "B", 3.35);
//         Mahasiswa23 m5 = new Mahasiswa23("244162331", "Devi", "A", 3.48);
//         Mahasiswa23 m6 = new Mahasiswa23("244160205", "Ehsan", "D", 3.61);
//         Mahasiswa23 m7 = new Mahasiswa23("244162370", "Fajar", "B", 3.86);

//         Mahasiswa23[] dataMahasiswa = {
//                 m1, m2, m3, m4, m5, m6, m7
//         };

//         int idxLast = 6;

//         bta.populateData(dataMahasiswa, idxLast);

//         System.out.println("\nTraversal InOrder Binary Tree Array:");
//         bta.traverseInOrder(0);
//     }
// }

public class BinaryTreeArrayMain23 {
    public static void main(String[] args) {

        BinaryTreeArray23 bta = new BinaryTreeArray23();

        bta.data = new Mahasiswa23[10];
        bta.idxLast = -1;

        Mahasiswa23 m1 = new Mahasiswa23("244162321", "Ali", "A", 3.57);
        Mahasiswa23 m2 = new Mahasiswa23("244162385", "Candra", "C", 3.41);
        Mahasiswa23 m3 = new Mahasiswa23("244160221", "Badar", "B", 3.75);
        Mahasiswa23 m4 = new Mahasiswa23("244160220", "Dewi", "B", 3.35);
        Mahasiswa23 m5 = new Mahasiswa23("244162331", "Devi", "A", 3.48);
        Mahasiswa23 m6 = new Mahasiswa23("244160205", "Ehsan", "D", 3.61);
        Mahasiswa23 m7 = new Mahasiswa23("244162370", "Fajar", "B", 3.86);

        bta.add(m1);
        bta.add(m2);
        bta.add(m3);
        bta.add(m4);
        bta.add(m5);
        bta.add(m6);
        bta.add(m7);

        System.out.println("\nTraversal InOrder:");
        bta.traverseInOrder(0);

        System.out.println("\nTraversal PreOrder:");
        bta.traversePreOrder(0);
    }
}