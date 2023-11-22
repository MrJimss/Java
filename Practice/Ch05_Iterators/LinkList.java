package Ch05_Iterators;

class LinkList
{
	private Link first;            // ref to first item on list
	private int count=0;

	//-------------------------------------------------------------
	public LinkList()              // constructor
	{ first = null; }           // no items on list yet
	//-------------------------------------------------------------
	public Link getFirst()         // get value of first
	{ return first; }
	//-------------------------------------------------------------
	public void setFirst(Link f)   // set first to new link
	{ first = f; }
	//-------------------------------------------------------------
	public boolean isEmpty()       // true if list is empty
	{ return first==null; }
	//-------------------------------------------------------------
	public ListIterator getIterator()  // return iterator
	{
		return new ListIterator(this);  // initialized with
	}                               //    this list
	//-------------------------------------------------------------
	public void displayList()
	{
		Link current = first;       // start at beginning of list
		while(current != null)      // until end of list,
		{
			current.displayLink();   // print data
			current = current.next;  // move to next link
			
		}
		System.out.println("");
	}
	//------------------------------------------
	public void displayCount()
	{
		if (isEmpty())
		{
			System.out.println("the list is empty!");
		}
		else 
		{
		Link current = first;       // start at beginning of list
		while(current != null)      // until end of list,
		{
			current = current.next;  // move to next link
			count++;	
		}
		}
			System.out.println("There are "+ count +" items ");
	}
	//-------------------------------------------------------------
}  // end class LinkList
