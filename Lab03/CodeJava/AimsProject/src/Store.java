public class Store {
    // Số lượng tối đa DVD có thể lưu trữ trong cửa hàng
    public static final int MAX_ITEMS_IN_STORE = 100;

    // Mảng chứa các DVD có trong cửa hàng
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(dvd)) {
                // Dịch chuyển các phần tử phía sau về trước để xóa DVD
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null; // Gán phần tử cuối cùng thành null
                qtyInStore--;
                found = true;
                System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" is not found in the store.");
        }
    }

    // Phương thức in danh sách các DVD trong cửa hàng
    public void printStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Available Items:");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
        System.out.println("***************************************************");
    }
}
