package medistorepharmacyinventorysalessystem;

public interface ISellable {
	double sell(int qty);
    boolean checkExpiry();
}
