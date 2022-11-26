public class Matryoshka {
    private int weight;
    private String name;
    private Matryoshka doll;

    public Matryoshka(String name, int weight, Matryoshka doll) {
        this.weight = weight;
        this.name = name;
        this.doll = doll;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Matryoshka getDoll() {
        return doll;
    }

    public void setDoll(Matryoshka doll) {
        this.doll = doll;
    }
}
