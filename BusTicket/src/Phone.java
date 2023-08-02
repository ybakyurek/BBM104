public class Phone {
    private String countryCode;
    private String code;
    private int number;
    private String type;

    public Phone(String countryCode, String code, int number, String type) {
        this.countryCode = countryCode;
        this.code = code;
        this.number = number;
        this.type = type;
    }

    public Phone(String code, int number, String type) {
        this.countryCode = "+90";
        this.code = code;
        this.number = number;
        this.type = type;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  type + " Phone: " +  countryCode + " " +"(" + code +") "+ number;
    }
}
