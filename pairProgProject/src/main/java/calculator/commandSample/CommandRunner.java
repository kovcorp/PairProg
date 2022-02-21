package calculator.commandSample;

public class CommandRunner {
    public static void main(String [] args)
    {
        System.out.println("----==== Command Runner ====----");

        OperationExecutor executor = new OperationExecutor();

        AlphaOperation alphaOperation = new AlphaOperation(new Sample("Alpha - Sample"));
        BetaOperation betaOperation = new BetaOperation(new Sample("Beta - Sample"));

        String operationResultAlpha = executor.executeOperation(alphaOperation);
        String operationResultBeta = executor.executeOperation(betaOperation);

        System.out.println(operationResultAlpha);
        System.out.println(operationResultBeta);
    }
}
