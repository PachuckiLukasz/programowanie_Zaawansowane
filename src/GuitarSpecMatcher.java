public class GuitarSpecMatcher {
    public static boolean matches(GuitarSpec spec, GuitarSpec otherSpec) {
        if (!matchesAttribute(spec.getBuilder(), otherSpec.getBuilder())) return false;
        if (!matchesStringAttribute(spec.getModel(), otherSpec.getModel())) return false;
        if (!matchesAttribute(spec.getType(), otherSpec.getType())) return false;
        if (!matchesAttribute(spec.getNumStrings(), otherSpec.getNumStrings())) return false;
        if (!matchesAttribute(spec.getBackWood(), otherSpec.getBackWood())) return false;
        return matchesAttribute(spec.getTopWood(), otherSpec.getTopWood());
    }

    private static <T> boolean matchesAttribute(T value, T otherValue) {
        return otherValue == null || value.equals(otherValue);
    }

    private static boolean matchesStringAttribute(String value, String otherValue) {
        return otherValue == null || otherValue.isEmpty() || value.equalsIgnoreCase(otherValue);
    }

    private static boolean matchesAttribute(int value, int otherValue) {
        return otherValue == 0 || value == otherValue;
    }
}
