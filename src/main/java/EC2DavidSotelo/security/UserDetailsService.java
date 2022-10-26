package EC2DavidSotelo.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		if("profesor".equals(username)) {
			return new User("profesor", "admin", new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("Usuario no existe"+ username);
		}

	}

}
