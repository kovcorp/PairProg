package calculator.commandSample;

/**
 * Receiver
 */
public class Sample {

    private String _name;

    public Sample(String name)
    {
        _name = name;
    }

    public String doAlphaOperation()
    {
        return String.format("Doing alpha operation name[%s]", _name);
    }

    public String doBetaOperation()
    {
        return String.format("Doing beta operation name[%s]", _name);
    }
}
