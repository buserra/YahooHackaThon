
public class Node
{
	public int severity, count;
	private String name, property, date, summary;
	
	public Node(int xSeverity, int xCount, String xName, String xProperty, 
			String xDate, String xSummary)
	{
		severity = xSeverity;
		count = xCount;
		name = xName;
		property = xProperty;
		date = xDate;
		summary = xSummary;
	}
	
}
