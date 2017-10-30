public class CalculationFactory {
	public Calculation getOperation(String operation) 
	{
		if(operation == null) 
		{
			return null;
		}
		if(operation.equalsIgnoreCase("ADD")) 
		{
			return new Add();
		}
		else if(operation.equalsIgnoreCase("Subtract")) 
		{
			return new Subtract();
		}
		else if(operation.equalsIgnoreCase("Multiply")) 
		{
			return new Multiply();
		}
		else if(operation.equalsIgnoreCase("Divide")) 
		{
			return new Divide();
		}
		
		return null;
	}
}