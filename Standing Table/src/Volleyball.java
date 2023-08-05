public class Volleyball extends Sports{
    public Volleyball(String name) {
        super(name);
    }
    @Override
    public void entryMatch(int f, int a) {
        setG(getG()+1);
        //calculate W,D,L using f,a
        setW((f > a) ? getW() + 1 : getW());
        setL((f < a) ? getL() + 1 : getL());
        setF(getF()+f);
        setA(getA()+a);
        setGD(getGD()+f-a);
        setP((f - a >=2) ? getP() + 3 : getP());
        setP((f - a ==1) ? getP() + 2 : getP());
        setP((a - f ==1) ? getP() + 1 : getP());
    }
}
