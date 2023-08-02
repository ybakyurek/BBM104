public class Passenger {
    private String name,surname,gender;
    private Phone phone;

    public Passenger(String name, String surname, String gender, Phone phone) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name +" " + surname +
                "(" + gender + ")"+"\t" +  phone ;
    }
}
