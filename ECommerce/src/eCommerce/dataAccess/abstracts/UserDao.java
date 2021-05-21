package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	User getbyId(int id);
	User getbyMail(String email);
	User getByEmailAndPassword(String email, String password);
	List<User> getAll();
}
