package generics.dynamiconlinemarketplace;
public enum BookCategory implements BaseCategory {
    FICTION, NON_FICTION, EDUCATION;

    public String getCategoryName() {
        return name();
    }
}
