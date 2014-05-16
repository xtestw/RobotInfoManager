package com.robot.dao.inte;

import java.util.List;

import com.robot.model.Pager;

public interface IBaseDao<T> {
	public void add(T t);
	public void addObj(Object obj);
	public void update(T t);
	public void updateObj(Object obj);
	public void delete(Object obj);
	public void delete(int id);
	public T load(int id);
	/**
	 * 
	 * @param hql
	 * @param args
	 * @return
	 */
	public List<T> list(String hql,Object[] args);
	public List<T> list(String hql);
	public List<T> list(String hql,Object obj);
	public List<Object> listByObj(String hql,Object[] args);
	public List<Object> listByObj(String hql);
	public List<Object> listByObj(String hql,Object obj);
	/**
	 * @param hql
	 * @param args
	 * @return
	 */
	public Pager<T> find(String hql,Object[] args);
	public Pager<T> find(String hql,Object obj);
	public Pager<T> find(String hql);
	
	public Pager<Object> findByObj(String hql,Object[] args);
	public Pager<Object> findByObj(String hql,Object obj);
	public Pager<Object> findByObj(String hql);
	/**
	 * @param hql
	 * @param args
	 * @return
	 */
	public Object queryByHql(String hql,Object[] args);
	public Object queryByHql(String hql,Object arg);
	public Object queryByHql(String hql);
	/**
	 * @param hql
	 * @param args
	 */
	public void executeByHql(String hql,Object[] args);
	public void executeByHql(String hql,Object arg);
	public void executeByHql(String hql);
}	