package calculator.commandSample;
/**
 * This is an example implementation of the Command pattern.
 * More info in the link below
 * https://en.wikipedia.org/wiki/Command_pattern
 *
 * {@link calculator.commandSample.SampleOperationCommand} this is an interface to describe how
 * the Command works.
 * Implementations of the interface are:
 *      {@link  calculator.commandSample.AlphaOperation}
 *      {@link calculator.commandSample.BetaOperation}
 *
 * The Receiver
 * {@link calculator.commandSample.Sample} this class is responsible for
 * implements the business logic what is called when the command executed.
 *
 * The Client function is implemented in the {@link calculator.commandSample.CommandRunner}
 *
 */