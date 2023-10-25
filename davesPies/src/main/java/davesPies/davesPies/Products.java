package davesPies.davesPies;

public class Products {
    
    private String pieName;
    private String pieDescription;

    public Products(String pieName, String pieDescription) {

        this.pieName = pieName;
        this.pieDescription = pieDescription;

    }

    public String getPieName() {
        return pieName;
    }

    public void setPieName(String pieName) {
        this.pieName = pieName;
    }

    public String getPieDescription() {
        return pieDescription;
    }

    public void setPieDescription(String pieDescription) {
        this.pieDescription = pieDescription;
    }
    
}
