package calculator.commandSample;

import java.util.ArrayList;
import java.util.List;

/**
 * The Invoker
 */
public class OperationExecutor {

    private final List<SampleOperationCommand> _operation = new ArrayList<>();

    public String executeOperation(SampleOperationCommand command) {
        _operation.add(command);
        return command.execute();
    }
}
