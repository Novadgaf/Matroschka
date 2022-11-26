public class Nesting {
    public Nesting() {
    }

    public String describe(Matryoshka m) {
        if (m == null) return "";

        String weight = Integer.toString(m.getWeight());
        String name = m.getName();
        Matryoshka doll = unnest(m);
        String dollDescription = describe(doll);
        String returnValue = "[" + name + " " + dollDescription + weight + "] ";

        return returnValue;
    }

    public Matryoshka nest(String n, int w, Matryoshka m) {
        Matryoshka matryoshka = new Matryoshka(n, w, m);

        return matryoshka;
    }

    public Matryoshka unnest(Matryoshka m) {
        return m.getDoll();
    }

    public int getTotalWeightR(Matryoshka m) {
        int totalWeight = m.getWeight();
        Matryoshka nested = unnest(m);
        if (unnest(m) == null) return totalWeight;
        totalWeight += getTotalWeightR(nested);
        return totalWeight;
    }

    public int getTotalWeightI(Matryoshka m) {
        int totalWeight = 0;
        Matryoshka currentM = m;
        while (true) {
            totalWeight += currentM.getWeight();
            currentM = unnest(currentM);
            if (currentM == null) break;
        }
        return totalWeight;
    }
}
