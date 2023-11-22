package Ch07_HashTables;

class HashTable
{
	private DataItem[] hashArray;    // array holds hash table
	private int arraySize;
	private DataItem nonItem;        // for deleted items
	int count=0;
	//-------------------------------------------------------------
	public HashTable(int size)       // constructor
	{
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem(-1);   // deleted item key is -1
	}
	//-------------------------------------------------------------
	public void displayTable()
	{
		System.out.print("Table: ");
		for(int j=0; j<arraySize; j++)
		{
			if(hashArray[j] != null)
				System.out.print(hashArray[j].getKey() + " ");
			else
				System.out.print("** ");
		}
		System.out.println("");
	}
	//-------------------------------------------------------------
	public int hashFunc(int key)
	{
		return key % arraySize;       // hash function
	}
	//-------------------------------------------------------------
	public void insert(DataItem item) // insert a DataItem
	// (assumes table not full)
	{	count++;
		if((count>(arraySize/2)))	
		{
			rehash();
			System.out.println("Rehashing "+ count + " elements. New Array size is "+ arraySize);
		}
		
		int key = item.getKey();      // extract key
		int hashVal = hashFunc(key);  // hash the key
		int n=1;
		while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) // until empty cell or -1
		{
			hashVal+=(n^2);                 // go to next cell
			hashVal %= arraySize;      // wraparound if necessary
			n++;
		}
		hashArray[hashVal] = item;    // insert item
		
	}  // end insert()
	//-------------------------------------------------------------
	public DataItem delete(int key)  // delete a DataItem
	{
		--count;
		int hashVal = hashFunc(key);  // hash the key
		while(hashArray[hashVal] != null)  // until empty cell,
		{                               // found the key?
			if(hashArray[hashVal].getKey() == key)
			{
				DataItem temp = hashArray[hashVal]; // save item
				hashArray[hashVal] = nonItem;       // delete item
				return temp;                        // return item
			}
			++hashVal;                 // go to next cell
			hashVal %= arraySize;      // wraparound if necessary
		}
		
		return null;                  // can't find item
	}  // end delete()
	//-------------------------------------------------------------
	public DataItem find(int key)    // find item with key
	{
		int hashVal = hashFunc(key);  // hash the key

		while(hashArray[hashVal] != null)  // until empty cell,
		{                               // found the key?
			if(hashArray[hashVal].getKey() == key)
				return hashArray[hashVal];   // yes, return item
			++hashVal;                 // go to next cell
			hashVal %= arraySize;      // wraparound if necessary
		}
		return null;                  // can't find item
	}
	//-------------------------------------------------------------

	private void rehash() //rehash method only called by other method in the class
	{
		int rehash;
		int resize=getPrime();
		int j=arraySize;
		DataItem[] tempArray= new DataItem[resize];
		arraySize=resize;
		for(int i=0;i<j;i++)
		{
			if(hashArray[i]!=null && hashArray[i].getKey()!=-1)
			{
				rehash=hashFunc(hashArray[i].getKey());
				if(tempArray[rehash]!=null)
				{
					++rehash;
					rehash%=arraySize;
				}
				else
					tempArray[rehash]=hashArray[i];
			}
		}
		hashArray=tempArray;
	}
	private int getPrime()
	{
		for(int j=2*arraySize;true;j++)
			if (isPrime(j))
		return j;
	}
	private boolean isPrime(int n)
	{
		for(int j=2; (j*j<=n) ; j++) 
			if( n % j == 0)
				return false; 
		return true;
	}

}  // end class HashTable
