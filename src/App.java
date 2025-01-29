public class App {
    public static void main(String[] args) throws Exception {
        Dog Clifford = new Dog("Cliff", 10);
        corgi Cheddar = new corgi();
        System.out.println(Cheddar);
        System.out.println(Cheddar.speak(3));
        welsh Winston = new welsh();
        System.out.println(Winston.getTreat());
        System.out.println(Clifford.speak());

        Dog[] doggies = {Clifford, Cheddar, Winston};



        for(Dog d: doggies) {
            System.out.println(makecollar(d));
        }
        
        System.out.println();

    }


    //Given an array of Corgis, how many are NOT welshes

    public static int countcorgies(Dog[] doggies) {
        int output = 0;
        for(Dog d : doggies) {
            if(d.getClass().equals(corgi.class)) { //quicker way
                output++;
            }
            //d.getClass() returns the deepest level of the class it is

        }
        return output;
    }

    //Method that takes in two dogs and if either of them are a welsh, then it sets the other dogs age to -1 (its not a welsh)
    //PIT FIGHT
    public static Dog welshFight(Dog dog1, Dog dog2) {
        //faster version
        /* 
        if(dog1 instanceof welsh && !(dog2 instanceof welsh)) {
            dog2.setAge(-1);
            return dog2;
        }*/


        //slower version
        if(dog1 instanceof welsh) {
            if(!(dog2 instanceof welsh)) {
                dog2.setAge(-1);
                return dog2;
            }
        }
        if(dog2 instanceof welsh) {
            if(!(dog1 instanceof welsh)) {
                dog1.setAge(-1);
                return dog1;
            }
        }



        return null;
    }



    public static String makecollar(Dog d) {
        int number = (int)(Math.random()*900 + 100);
        return d.getName() + number;
    }


}
