public class welsh extends corgi {
    private String teachoice;
    public welsh() {
        super("Crumpet",10,3);
        legsize = 5;
        teachoice = "Yorkshire";
    }


    public String getTreat() {
        if(teachoice.equals("Yorkshire")) {
            return "Pudding";
        }
        return "Crumpet";
    }
}
