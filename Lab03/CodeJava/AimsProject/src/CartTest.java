public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",  "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // Test the print method
        cart.print();
        // Tìm kiếm DVD theo ID
        cart.searchById(1); // Tìm DVD có ID = 1
        cart.searchById(5); // Tìm DVD không tồn tại

        // Tìm kiếm DVD theo tiêu đề
        cart.searchByTitle("Star Wars"); // Tìm DVD có tiêu đề "Movie 2"
        cart.searchByTitle("Nonexistent Movie"); // Tìm DVD không tồn tại

        // To-do: Test the search methods here
    }
}
