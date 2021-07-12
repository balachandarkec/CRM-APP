package in.bala.crmapp.model;

public class Customer {
    private int id;
    private String name;
    private String email;

    //getters,setters

    @Override
    public String toString() {
        return this.id+"-"+this.name+"-"+this.email;
    }
}
