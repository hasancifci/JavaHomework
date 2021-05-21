package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;
	

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		System.out.println("user added : " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("user deleted : " + user.getFirstName());	
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		System.out.println("user updated : " + user.getFirstName());
	}

	@Override
	public User getById(int id) {
		return userDao.getbyId(id);
	}

	@Override
	public User getByMail(String email) {
		// TODO Auto-generated method stub
		return userDao.getbyMail(email);
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		return userDao.getByEmailAndPassword(email, password);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}
