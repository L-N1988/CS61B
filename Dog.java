public class Dog {
    public int weightInPounds;

    public Dog(int w) {
        weightInPounds = w;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }    
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }

	public void bark(){
		System.out.println("Moo");
	}
	public static void runFast(){
		System.out.println("Ruff Run");
	}
   
    public static void main(String[] args) {
        Dog d = new Dog(20);
        d.makeNoise();
        
        Dog d1 = new Dog(15);
        Dog d2 = new Dog(100);
        Dog.maxDog(d1, d2).makeNoise();

        Dog smallDog = new Dog(5);
   		Dog mediumDog = new Dog(25);
   		Dog hugeDog = new Dog(150);
 
   		Dog[] manyDogs = new Dog[4];  
        manyDogs[0] = smallDog;
   		manyDogs[1] = hugeDog;    	   
        manyDogs[2] = new Dog(130);
		manyDogs[3] = new Dog(150);
 
   		int i = 0;
   		while (i < manyDogs.length) {
       		Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
       		i = i + 1;
        }

		System.out.println("*********************************************");
		
		Dog poppa = new Dog(10);
		poppa.bark();
		// Dog.bark();
		poppa.runFast();
		Dog.runFast();
    }

}
