/**
 * 
 */
package org.escoladeltreball.forthassignmenttopics;

/**
 * @author iaw39443990
 *
 */
public interface Manager {
	/**
	 * retorna els veicles en funció de la data i la hora del sistema
	 * @return 
	 * @throws Exception
	 */
	public abstract ITV getNext() throws Exception;
}
