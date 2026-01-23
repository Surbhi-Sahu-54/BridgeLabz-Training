package generics.dynamiconlinemarketplace;
public enum GadgetCategory implements BaseCategory {
    MOBILE, LAPTOP, ACCESSORY;

    public String getCategoryName() {
        return name();
    }
}
