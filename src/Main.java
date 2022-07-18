public class Main {
    public static void main(String[] args) {

        linkeylist linkey = new linkeylist();

        linkey.insertFirst(5);
        linkey.insertFirst(6);
        linkey.insertFirst(7);
        linkey.insertFirst(8);

        linkey.display();

        System.out.println(linkey.find(6));
    }
}
