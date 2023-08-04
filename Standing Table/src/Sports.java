import java.util.*;

public abstract class Sports {
    private String name;
    /*
    G: Game
    W: Won
    D: Draw
    L: Lost
    F: For goal
    A: Against goal;
    GD: Goal Difference
    P: Point
     */
    private int G,W,D,L,F,A,GD,P;

    public Sports(String name, int g, int w, int d, int l, int f, int a, int GD, int p) {
        this.name = name;
    }
    public Sports(String name) {
        this.name = name;
        G = 0;
        W = 0;
        D = 0;
        L = 0;
        F = 0;
        A = 0;
        GD = 0;
        P = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public int getW() {
        return W;
    }

    public void setW(int w) {
        W = w;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }

    public int getF() {
        return F;
    }

    public void setF(int f) {
        F = f;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getGD() {
        return GD;
    }

    public void setGD(int GD) {
        this.GD = GD;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

    public void entryMatch(int f, int a){
        this.G += 1;//+1 for game
        //calculate W,D,L using f,a
        W = (f > a) ? W + 1 : W;
        D = (f == a) ? D + 1 : D;
        L = (f < a) ? L + 1 : L;
        F+=f;
        A+=a;
        GD += f-a;
     }

    public abstract void calculatePoint();


    /*
    This part allows only the name of the object, not the whole object, to be kept unique in the HashSet.
    Thus, we can maintain the teams as unique
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sports sports = (Sports) o;
        return Objects.equals(name, sports.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        return (String.format("%-20s %4d %4d %4d %4d %4d %4d %4d %4d", name, G, W, D, L, F, A, GD, P));
    }



}


