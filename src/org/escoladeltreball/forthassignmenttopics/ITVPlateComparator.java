/**
 * 
 */
package org.escoladeltreball.forthassignmenttopics;

import java.util.Comparator;

/**
 * @author iaw39443990
 *
 */
public class ITVPlateComparator implements Comparator<ITV> {

	/**
	 * 
	 */
	public ITVPlateComparator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(ITV itv1, ITV itv2) {
		return itv1.getMatricula().compareTo(itv2.getMatricula());
	}

}
