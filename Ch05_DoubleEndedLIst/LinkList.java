package Ch05_DoubleEndedLIst;

class LinkList
{
	private Link first;            // ref to first item on list
     private Link last;
	//-------------------------------------------------------------
	public LinkList()              // constructor
	{    first = null;           // no items on list yet
          last = null;
     }
	//-------------------------------------------------------------
	public boolean isEmpty()       // true if list is empty
	{ return (first==null); }
	//-------------------------------------------------------------
	public void insertFirst(long dd) // insert at start of list
	{                                  // make new link
		Link newLink = new Link(dd);
          if (isEmpty())
               last= newLink;
		newLink.next = first;       // newLink --> old first
		first = newLink;            // first --> newLink
	}
	//-------------------------------------------------------------
	public long deleteFirst()      // delete first item
	{                           // (assumes list not empty)
		Link temp = first;          // save reference to link
		first = first.next;         // delete it: first-->old next
		return temp.dData;          // return deleted link
	}
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
	//-------------------------------------------------------------
	public void insertLast(long id)
	{
		Link lastLink = new Link(id);
		if (isEmpty())
			insertFirst(id);
		last.next=lastLink;
		lastLink.next=null;
		
	}
	//-------------------------------------------------------------
}  // end class LinkList