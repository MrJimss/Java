package Ch05_LinkedLists;

class LinkList {
	private Link first;            // ref to first link on list
	//-------------------------------------------------------------
	public LinkList()              // constructor
	{
		first = null;               // no links on list yet
	}
	//-------------------------------------------------------------
	public void insertFirst(int id)
	{                           // make new link
		Link newLink = new Link(id);
		newLink.next = first;       // it points to old first link
		first = newLink;            // now first points to this
	}
	//-------------------------------------------------------------
	public Link find(int key)      // find link with given key
	{                           // (assumes non-empty list)
		Link current = first;              // start at 'first'
		while(current.iData != key)        // while no match,
		{
			if(current.next == null)        // if end of list,
				return null;                 // didn't find it
			else                            // not end of list,
				current = current.next;      // go to next link
		}
		return current;                    // found it
	} // return the reference helps if other stuff needs to be done with the reference
	//-------------------------------------------------------------
	public Link delete(int key)    // delete link with given key
	{                           // (assumes non-empty list)
		Link current = first;              // search for link
		Link previous = first;
		while(current.iData != key)
		{
			if(current.next == null)
				return null;                 // didn't find it
			else
			{
				previous = current;          // go to next link
				current = current.next;
			}
		}                               // found it
		if(current == first)               // if first link,
			first = first.next;             //    change first
		else                               // otherwise,
			previous.next = current.next;   //    bypass it
		return current;
	}
	//-------------------------------------------------------------
	public void displayList()      // display the list
	{
		System.out.print("List (first-->last): ");
		Link current = first;       // start at beginning of list
		while(current != null)      // until end of list,
		{
			current.displayLink();   // print data
			current = current.next;  // move to next link
		}
		System.out.println("");
	}
	//-------------------------------------------------------------
	public boolean isEmpty()
	{
		if(this.first == null)
			return true;
		else
			return false;
	}
}  // end class LinkList