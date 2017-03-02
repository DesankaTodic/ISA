package rs.ac.uns.ftn.informatika.jpa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import rs.ac.uns.ftn.informatika.jpa.domain.User;
import rs.ac.uns.ftn.informatika.jpa.domain.users.Guest;

public interface GuestRepository extends PagingAndSortingRepository<Guest, Long>{

	
	public ArrayList<Guest> findAll();
	
	public Guest findGuestByEmail(String email);
	
	@SuppressWarnings("rawtypes")
	List<Guest> findByFriends(List friends);

	 @Query("select r from User r where r.email = ?1 and r.password = ?2")
	 User findUserByEmailAndPassword(String email, String password);
	  
	 @Query("select r from Guest r where r.name = ?1")
	 List<Guest> findGuestsByName(String name);
	 
	 @Query("select r from Guest r where r.surname = ?1")
	 List<Guest> findGuestsBySurname(String surname);
	 
	 
	 @Query("select r from Guest r where r.name = ?1 and r.surname = ?2")
	 List<Guest> findGuestsByNameAndSurname(String name, String surname);
	 
	 
}
