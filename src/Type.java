enum Type {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
        return switch (this) {
            case ACOUSTIC -> "Acoustic";
            case ELECTRIC -> "Electric";
            default -> "Unspecified";
        };
    }
}