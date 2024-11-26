package hust.soict.dsai.aims.cart;

import hust.soict.dsai.test.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBER_ORDER = 20;

    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];
    private int qtyOrdered = 0;

    // 1. Phương thức in danh sách các mặt hàng trong giỏ
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    // 2. Phương thức tìm kiếm DVD theo ID
    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getId() == id) {
                System.out.println("DVD found: " + itemOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    // 3. Phương thức tìm kiếm DVD theo tiêu đề
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].isMatch(title)) {
                System.out.println("DVD found: " + itemOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }

   
   
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDER) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    } 
 
 /*Mảng
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (qtyOrdered < MAX_NUMBER_ORDER) {
                itemOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("The disc \"" + dvd.getTitle() + "\" has been added.");
            } else {
                System.out.println("The cart is full. Cannot add \"" + dvd.getTitle() + "\".");
            }
        }
    }*/
 /* Varargs DigitalVideoDisc...
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            if (qtyOrdered < MAX_NUMBER_ORDER) {
                itemOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("The disc \"" + dvd.getTitle() + "\" has been added.");
            } else {
                System.out.println("The cart is full. Cannot add \"" + dvd.getTitle() + "\".");
            }
        }
    }*/
    /*2.2
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBER_ORDER) {
            itemOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The disc \"" + dvd1.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is full. Cannot add \"" + dvd1.getTitle() + "\".");
        }

        if (qtyOrdered < MAX_NUMBER_ORDER) {
            itemOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The disc \"" + dvd2.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is full. Cannot add \"" + dvd2.getTitle() + "\".");
        }
    }
*/
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }
}