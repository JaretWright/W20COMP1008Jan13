public class TestingShoe {
    public static void main(String[] args)
    {
        Shoe shoe1 = new Shoe(8,"brown","Nike","running","female",179.99);
        Shoe shoe2 = new Shoe(12,"white","Adidas","hiking","male",203.22);

        System.out.printf("shoe1: %s%n", shoe1);
        System.out.printf("shoe2: %s%n", shoe2);
    }
}
