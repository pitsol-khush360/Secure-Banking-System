/**
 * 
 */
package com.group9.bankofaz.dao;

import java.util.Date;
import java.util.List;


import com.group9.bankofaz.model.Logs;

/**
 * @author Abhishek Bishnoi
 *
 */
public interface LogsDAO {
	public void add(Logs logs);

	public List<Logs> findLogs();
}
