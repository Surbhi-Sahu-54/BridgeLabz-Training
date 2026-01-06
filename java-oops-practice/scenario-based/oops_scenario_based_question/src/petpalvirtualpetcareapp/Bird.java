package petpalvirtualpetcareapp;

	class Bird extends Pet {

	    public Bird(String name, int age) {
	        super(name, "Bird", age);
	    }

	    void makeSound() {
	        System.out.println(name + " says: Tweet! 🐦");
	    }
}
