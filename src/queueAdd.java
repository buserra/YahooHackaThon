import java.util.Queue;


public class queueAdd {

	Queue<Node> Queue1, Queue2, Queue3, Queue4, Queue5, Queue6, Queue7;
	
	public queueAdd(Node queue)
	{
		switch(queue.property)
		{
			case "Media":
			{
				Queue1.add(queue);
				break;
			}
			case "Frontpage":
			{
				Queue2.add(queue);
				break;
			}
			case "Mail":
			{
				Queue3.add(queue);
				break;
			}
			case "Flickr":
			{
				Queue4.add(queue);
				break;
			}
			case "Search":
			{
				Queue5.add(queue);
				break;
			}
			case "Revenue":
			{
				Queue6.add(queue);
				break;
			}
			case "Messenger":
			{
				Queue7.add(queue);
				break;
			}
			default:
			{
				
			}
		}
	}
	
}
