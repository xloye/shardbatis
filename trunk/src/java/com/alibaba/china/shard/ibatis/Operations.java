/*
 * Copyright 2002-2006 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.china.shard.ibatis;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

/**
 * @author        Argan Wang
 */
public interface Operations {

	/**
	 * @see com.ibatis.sqlmap.client.SqlMapExecutor#queryForObject(String, Object)
	 * @throws org.springframework.dao.DataAccessException in case of errors
	 */
	Object queryForObject(String statementName, Object parameterObject)
			throws DataAccessException;

	/**
	 * @see com.ibatis.sqlmap.client.SqlMapExecutor#queryForObject(String, Object, Object)
	 * @throws org.springframework.dao.DataAccessException in case of errors
	 */
	Object queryForObject(String statementName, Object parameterObject,	Object resultObject)
			throws DataAccessException;

	/**
	 * @see com.ibatis.sqlmap.client.SqlMapExecutor#queryForList(String, Object)
	 * @throws org.springframework.dao.DataAccessException in case of errors
	 */
    @SuppressWarnings("unchecked")
    List queryForList(String statementName, Object parameterObject)
			throws DataAccessException;

	/**
	 * @see com.ibatis.sqlmap.client.SqlMapExecutor#queryForMap(String, Object, String)
	 * @throws org.springframework.dao.DataAccessException in case of errors
	 */
	@SuppressWarnings("unchecked")
    Map queryForMap(String statementName, Object parameterObject, String keyProperty)
			throws DataAccessException;

	/**
	 * @see com.ibatis.sqlmap.client.SqlMapExecutor#queryForMap(String, Object, String, String)
	 * @throws org.springframework.dao.DataAccessException in case of errors
	 */
	@SuppressWarnings("unchecked")
    Map queryForMap(String statementName, Object parameterObject, String keyProperty, String valueProperty)
			throws DataAccessException;

	/**
	 * @see com.ibatis.sqlmap.client.SqlMapExecutor#insert(String, Object)
	 * @throws org.springframework.dao.DataAccessException in case of errors
	 */
	Object insert(String statementName, Object parameterObject) throws DataAccessException;

	/**
	 * @see com.ibatis.sqlmap.client.SqlMapExecutor#update(String, Object)
	 * @throws org.springframework.dao.DataAccessException in case of errors
	 */
	int update(String statementName, Object parameterObject) throws DataAccessException;

	/**
	 * @see com.ibatis.sqlmap.client.SqlMapExecutor#delete(String, Object)
	 * @throws org.springframework.dao.DataAccessException in case of errors
	 */
	int delete(String statementName, Object parameterObject) throws DataAccessException;

}
