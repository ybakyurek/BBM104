public class Basketball extends Sports{
    public Basketball(String name) {
        super(name);
    }

    @Override
    public void calculatePoint() {
        setP(getW()*2+getL());
    }
}
