package homework11_ENUM.cloth;

public enum Size {

    XXS(32) {
        public String getDescription() {
            return "Child size";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40),
    XL(42);

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription(){
        return "Adult size";
    }
}
