public class Icehockey extends Sports{
    public Icehockey(String name) {
        super(name);
    }

    @Override
    public void calculatePoint() {
        setP(getW()*2+getD());
    }

}
