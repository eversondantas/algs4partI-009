/**
 * Quick-Find: Java Implementation
 * @author Everson Dantas - eversoncdantas@gmail.com
 * @since 21/OUT/2015
 */
public class QuickFindUF {
	private int[] id;

	/**
	 * Set id of each object to itself (N array accesses)
	 * @author Everson Dantas - eversoncdantas@gmail.com
	 * @param N
	 */
	public QuickFindUF(int N) {
		this.id = new int[N];
		for (int i = 0; i < N; i++) {
			this.id[i] = i;
		}
	}

	/**
	 * Check whether p and q are in the same component (2 array accesses)
	 * @author Everson Dantas - eversoncdantas@gmail.com
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean connected(int p, int q) {
		return this.id[p] == this.id[q];
	}
	
	/**
	 * change all entries with id[p] to id[q] (at most 2N + 2 array accesses) 
	 * @param p
	 * @param q
	 */
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid) id[i] = qid;
		}
	}
}
