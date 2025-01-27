public class corgi extends Dog {
    private double legsize;
    public corgi() {
        this("Cheddar",0,4);
    }

    public corgi (String name, int age, double leg) {
        super(name, age);
        legsize = leg;
    }

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return "Cute Barkaloooooo";
    }

    //overload
    public String speak(int count) { //same name but diffrrent parameters
        String output = "";
        for(int i = 0; i < count; i++) {
            output += this.speak() + '\n';
        }
        return output;
    }

    public String toString() {
        return super.toString() + "Leg size: " + legsize;
    }
    
}
