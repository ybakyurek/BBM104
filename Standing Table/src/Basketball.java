public class Basketball extends Sports{
    public Basketball(String name) {
        super(name);
    }

    @Override
    public void entryMatch(int f, int a) {
        super.entryMatch(f, a);
        setP(getW()*2+getL());
    }
}
