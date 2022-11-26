public class Main {
    public static void main(String[] args) {
        Nesting nesting = new Nesting();
        Matryoshka n0 = nesting.nest("A", 0, null);
        Matryoshka n1 = new Matryoshka("B", 1, n0);
        Matryoshka n2 = new Matryoshka("C", 2, n1);
        System.out.println(nesting.describe(n0));
        System.out.println(nesting.describe(n1));
        System.out.println(nesting.describe(n2));
        System.out.println(nesting.getTotalWeightR(n2));
        System.out.println(nesting.getTotalWeightI(n2));
    }
}