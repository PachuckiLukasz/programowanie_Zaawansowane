class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(GuitarSpec otherSpec) {
        if (otherSpec.builder != null && builder != otherSpec.builder)
        return false;
        if (otherSpec.model != null && !otherSpec.model.equals("") &&
        !model.toLowerCase().equals(otherSpec.model.toLowerCase()))
        return false;
        if (otherSpec.type != null && type != otherSpec.type)
        return false;
        if (otherSpec.numStrings != 0 && numStrings != otherSpec.numStrings)
        return false;
        if (otherSpec.backWood != null && backWood != otherSpec.backWood)
        return false;
        if (otherSpec.topWood != null && topWood != otherSpec.topWood)
        return false;

        return true;
    }
}