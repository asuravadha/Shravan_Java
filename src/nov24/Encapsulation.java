package nov24;

public class Encapsulation {
static String name,role;

    private void data(){
        System.out.println("i am from encapsulation");
    }
    public void read_101_token6(){
        data();
    }

    public Encapsulation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
