package generics.dynamiconlinemarketplace;
public enum ClothingCategory implements BaseCategory {
    MEN, WOMEN, KIDS;

    public String getCategoryName() {
        return name();
    }
}
