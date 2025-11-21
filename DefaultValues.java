public class DefaultValues {
    byte BValue;
    short IValue;
    int PValue;
    long AValue;
    float SValue;
    double YValue;
    char NValue;
    boolean EValue;
    public static void main(String[] args) {
        DefaultValues K = new DefaultValues();
        System.out.println("Default byte value: " + K.BValue);
        System.out.println("Default short value: " + K.IValue);
        System.out.println("Default int value: " + K.PValue);
        System.out.println("Default long value: " + K.AValue);
        System.out.println("Default float value: " + K.SValue);
        System.out.println("Default double value: " + K.YValue);
        System.out.println("Default char value: '" + K.NValue + "'");
        System.out.println("Default boolean value: " + K.EValue);
    }
}
