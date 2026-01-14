package Model;
public class Students extends PERSON {
    private String MSSV;
    private String MaLop;
    
    

    public Students(String MSSV, String MaLop) {
        this.MSSV = MSSV;
        this.MaLop = MaLop;
    }

    public Students(String MSSV, String MaLop, String unique_id, String name, int age, String city, String gender) {
        // super(unique_id, name, age, city, gender);
        this.MSSV = MSSV;
        this.MaLop = MaLop;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void getSVInfor()
    {
        System.out.println(this.MSSV);
        System.out.println(this.MaLop);
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(this.gender);
        System.out.println(this.age);
    }    
}
