package oop.lab11.iterator.ex1;

public class IteratorTestDrive {
    public static void main(String[] args) {
        ProductCatalog listProductCatalog = new ListProductsCatalog();
        listProductCatalog.add("Apple");
        listProductCatalog.add("Banana");
        listProductCatalog.add("Orange");
        listProductCatalog.add("Lemon");
        listProductCatalog.add("Grape");

        Iterator it = listProductCatalog.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
