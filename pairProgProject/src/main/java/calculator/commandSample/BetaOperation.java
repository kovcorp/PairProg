package calculator.commandSample;

/**
 * Command for doing Beta operation.
 */
public class BetaOperation implements SampleOperationCommand {

    private Sample _sample;

    public BetaOperation(Sample sample) {
        _sample = sample;
    }

    @Override
    public String execute() {
        return  _sample.doBetaOperation();
    }
}
