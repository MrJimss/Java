package Ch07_HashTables;

class DataItem
{                                // (could have more data)
	private int iData;               // data item (key)
	//--------------------------------------------------------------
	public DataItem(int ii)          // constructor
	{ iData = ii; }
	//--------------------------------------------------------------
	public int getKey()
	{ return iData; }
	//--------------------------------------------------------------
}  // end class DataItem
