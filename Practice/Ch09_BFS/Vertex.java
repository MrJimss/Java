package Ch09_BFS;

class Vertex
{
	public char label;        // label (e.g. 'A')
	public boolean wasVisited;

	public Vertex(char lab)   // constructor
	{
		label = lab;
		wasVisited = false;
	}
}  // end class 
