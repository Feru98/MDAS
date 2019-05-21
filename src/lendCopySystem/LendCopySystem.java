package lendCopySystem;

/**
 * Lend Copy System class
 * @author Miguel Ángel Ramírez Ruiz
 *
 */
public class LendCopySystem {
	/**
	 * Private attribute (Applying singleton)
	 */
	 private LendCopySystem _lendCopySystem = null;
	 
	 /**
	  * Empty Constructor
	  */
	 private LendCopySystem() {};
	 
	 /**
	  * REAL Constructor
	  */
	 
	 public LendCopySystem getSystem() {
		 if(_lendCopySystem == null) {
			 _lendCopySystem = new LendCopySystem();
		 }
		 return _lendCopySystem;
	 }
}
