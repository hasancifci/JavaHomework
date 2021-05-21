package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Hibernate eklendi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		User userUpdate= getbyId(user.getId());
		userUpdate.setFirstName(user.getFirstName());
		userUpdate.setLastName(user.getLastName());
		userUpdate.setEmail(user.getEmail());
		userUpdate.setPassword(user.getPassword());
		
	}

	@Override
	public void delete(User user) {
		users.removeIf(u->u.getId()==user.getId());
		
	}

	@Override
	public User getbyId(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}

	@Override
	public User getbyMail(String email) {
		for (User user : users) {
			if (user.getEmail() == email)
				return user;
		}
		return null;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for(User user : users) {
			if (user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
