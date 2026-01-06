package petpalvirtualpetcareapp;

	class Cat extends Pet {

	    public Cat(String name, int age) {
	        super(name, "Cat", age);
	    }

	    void makeSound() {
	        System.out.println(name + " says: Meow! 🐱");
	    }
}
