package petpalvirtualpetcareapp;

	class Dog extends Pet {

	    public Dog(String name, int age) {
	        super(name, "Dog", age);
	    }
 
	    void makeSound() {
	        System.out.println(name + " says: Woof!");
	    }
}
