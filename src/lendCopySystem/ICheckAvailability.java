package lendCopySystem;

import CopyManager.Copy;

public interface ICheckAvailability {
	Copy getCopyData();
	
	boolean checkAvailability();
}
