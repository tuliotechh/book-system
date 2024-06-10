public class Main {
    public static void main(String[] args) {
        People[] p = new People[3];
        Book[] l = new Book[4];

        p[0] = new People("Marco", "M", 19);
        p[1] = new People("Jessica", "F", 22);

        l[0] = new Book("Java", "Jose da Silva", 300, p[0]);
        l[1] = new Book("POO", "Pedro Paulo", 500, p[1]);
        l[2] = new Book("Java Avançado", "Maria Candido", 800, p[0]);

        System.out.println(l[0].detalhes());
    }
}
