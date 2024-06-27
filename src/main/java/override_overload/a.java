package main.java.override_overload;

// Demonstrate overloading
public class a implements b {
    
    private String name = "Cloyd";

    @Override
    public String getMsg(String msg) {
        return msg;
    }

    public String getName() {
        return this.name;
    }
}
