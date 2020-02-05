import java.util.HashMap;
import java.util.Iterator;

public final class GitCommitObject {

	// Declaring all variables private and final to create immutable object
	private final int tree_id; 
	private final String Author;
	private final String commiter;
	private final String Commit_Message;
		
	public int getId() {
		return tree_id;
	}

	public String getAuthor() {
		return Author;
	}


	public String getCommiter() {
		return commiter;
	}


	public String getCommit_Message() {
		return Commit_Message;
	}
	
	
	public GitCommitObject(int i,String n,String c, String cm){
		this.tree_id=i;
		this.Author=n;
		this.commiter=c;
		this.Commit_Message=cm;
		
		
	}
	

	 public int hashCode() {
	        int hash = 7;
	        hash = 31 * hash + (int) tree_id;
	        hash = 31 * hash + (Author == null ? 0 : Author.hashCode());
	        hash = 31 * hash + (commiter == null ? 0 : commiter.hashCode());
	        hash = 31 * hash + (Commit_Message == null ? 0 : Commit_Message.hashCode());
	        //By using 31, its multiplication can be replaced 
	        //by a bitwise shift which is faster than the standard multiplication
	        return hash;
	    }
	
	
	public static void main(String[] args) {
		HashMap<Integer, Object> h1 = new HashMap<Integer,Object>();
	    String a = "Original";
		String c="Brian";
		String cm="First_Commit";
		int i=10;
		GitCommitObject gc = new GitCommitObject(i,a,c,cm);
		int hash_key=gc.hashCode();
		h1.put(hash_key,gc);
		
		// Checking if the copying works
		System.out.println(a==gc.getAuthor());
		System.out.println(c==gc.getCommiter());
		System.out.println(cm==gc.getCommit_Message());
		System.out.println("commit_id is");
		System.out.println(h1);
		
		
		//print the values
		System.out.println("Tree id:"+gc.getId());
		System.out.println("Author:"+gc.getAuthor());
		System.out.println("Commiter:"+gc.getCommiter());
		System.out.println("CommitMessage:"+gc.getCommit_Message());
		System.out.println("----------------------------------------------");
		
			}
}