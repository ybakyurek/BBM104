public class Icehockey extends Sports{
    public Icehockey(String name) {
        super(name);
    }


    @Override
    public void entryMatch(int f, int a) {
        super.entryMatch(f, a);
        setP(getW()*2+getD());
    }
}
