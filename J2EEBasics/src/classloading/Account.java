package classloading;

public class Account 
{
	static
	{
		System.out.println("ACCOUNT IS OPENING");
	}
}

/*static block can be used
 * 1) To develop a business logic
 * 2) Business logic must be common for every user
 * 3) Business logic should be executed only once in life cycle.
 * */


/*ATM
 * 1) Swipe card
 * 2) Select Language (common business logic)
 * 
 * */
 