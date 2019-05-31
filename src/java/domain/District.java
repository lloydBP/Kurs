package domain;

public class District {

    private Integer id;
    private String district;
    private String street;
    private String number;
    private String flat;
    private String member;

    public District(Integer id, String district, String street, String number, String flat, String member) {
        this.id = id;
        this.district = district;
        this.street = street;
        this.number = number;
        this.flat = flat;
        this.member = member;
    }

    public District() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }
}
