/**
 * 
 */
package org.escoladeltreball.forthassignmenttopics;

import java.time.LocalDateTime;

/**
 * @author iaw39443990
 *
 */
public class ItvManagerImpl extends ITVManager {

	/**
	 * @param itvFile
	 * @throws Exception
	 */
	public ItvManagerImpl(String itvFile) throws Exception {
		super(itvFile);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.forthassignmenttopics.Manager#getnext()
	 */
	@Override
	public ITV getNext() throws Exception {
		LocalDateTime now = LocalDateTime.now();

		return null;
	}

}
