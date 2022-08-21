public class Hash {

    private Item [] items;
    private final int size;

    public Hash(int size) {
        this.size = size;
        items = new Item[size];
    }

    private int getHash(int key){
        return key%size;
    }

    public void insert(Item item){
        int index = getHash(item.getKey());
        if(items[index] == null){
            items[index] = item;
        }else {
            int i = (index + 1) % size;
            while (items[i] != null && i != index){
                i = (i + 1) % size;
            }
            if (items[i] == null){
                items[i] = item;
            }
        }
    }

    public Item search(int key){
        int index = getHash(key);
        if (items[index].getKey() == key){
            return items[index];
        }else {
            int i = (index + 1) % size;
            while (items[i] == null || (i != index && items[i].getKey() != key)){
                i = (i + 1) % size;
            }

            if (items[i].getKey() == key){
                return items[i];
            }
            else {
                return null;
            }
        }
    }
    public void delete(int key){
        int index = getHash(key);
        if (items[index].getKey() == key){
            items[index] = null;
        }else {
            int i = (index + 1) % size;
            while (items[i] == null || (i != index && items[i].getKey() != key)){
                i = (i + 1) % size;
            }

            if (items[i].getKey() == key){
                items[i] = null;
            }
            else {
                System.out.println("Item not found!");
            }
        }
    }

    public void print (){
        for (int i = 0; i < size; i++) {
            if (items[i] != null){
                System.out.println("("+items[i].getKey()+","+items[i].getKey()+")");
            }else {
                System.out.println("null");
            }
        }
    }

}
