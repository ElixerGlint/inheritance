public class App {
    public static void main(String[] args) throws Exception {
        Dog Clifford = new Dog("Cliff", 10);
        corgi Cheddar = new corgi();
        System.out.println(Cheddar);
        System.out.println(Cheddar.speak(3));
        welsh doggy = new welsh();
        System.out.println(doggy.getTreat());
        System.out.println(Clifford.speak());

        Dog[] doggies = {Clifford, Cheddar, doggy};



        for(Dog d: doggies) {
            System.out.println(makecollar(d));
        }
    }

    public static String makecollar(Dog d) {
        int number = (int)(Math.random()*900 + 100);
        return d.getName() + number;
    }


}
