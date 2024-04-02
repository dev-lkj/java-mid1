package lang.immutable.address;

import java.lang.reflect.Member;

public class MemberV1 {
    private String name;
    private Address address;
    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
