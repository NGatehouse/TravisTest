
public class Divide implements Calculation 
{
	@Override
	public float calculate(float x, float y) 
	{
		if(y == 0) 
		{
			return 0;
		}
		return x / y;
	}
	
}
