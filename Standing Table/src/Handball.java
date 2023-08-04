public class Handball extends Sports{
    public Handball(String name) {
        super(name);
    }

    @Override
    public void calculatePoint() {
        setP(getW()*2+getD());
    }
}
