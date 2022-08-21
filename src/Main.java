public class Main {

    public static void main(String[] args) {
        Hash hash = new Hash(10);

        hash.insert(new Item(1,20));
        hash.insert(new Item(2,70));
        hash.insert(new Item(42,80));
        hash.insert(new Item(4,25));
        hash.insert(new Item(12,44));
        hash.insert(new Item(17,11));

        hash.delete(42);
        hash.delete(12);
        hash.delete(14);
        hash.print();
    }

}
