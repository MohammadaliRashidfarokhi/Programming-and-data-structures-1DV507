package mr223_assign1;

public class CollectionMain {
    public static void main(String[] args) {


        ArrayIntList java = new ArrayIntList(4);

       java.add(1378);
       java.add(1999);
       java.add(1995);
        System.out.println("First element:");
        java.print();

        System.out.println("Adding 20 at index 0 and replace 1378 with 20 ");
        java.addAt(20, 0);
        java.setValues();
        java.setSize();
        System.out.println("Size:");
        System.out.println(java.size());
        System.out.println("All elements:");
        System.out.println(java.toString());

    }
}
