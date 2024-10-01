package in.sp.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.sp.entitiy.User;

@Repository	
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int registerUser(User user) {
	Integer i = (Integer)this.hibernateTemplate.save(user);
	return i;
	}
}
