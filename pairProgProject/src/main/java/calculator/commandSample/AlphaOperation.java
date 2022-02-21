package calculator.commandSample;

/**
 * Command for doing Alpha operation.
 */
public class AlphaOperation implements SampleOperationCommand {

    private Sample _sample;

    public AlphaOperation(Sample sample) {
        _sample = sample;
    }

    @Override
    public String execute() {
        return _sample.doAlphaOperation();
    }
}
