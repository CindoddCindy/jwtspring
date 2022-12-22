package com.springjwt.jwtspring.security.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springjwt.jwtspring.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;

	private Long id;
  private String firstname;
	private String lastname;
	private String dateofbirth;
	private String gender;
	private String email;
	private String mobileno;
	private String address;
	private String city;
	private String state;
	private String country;
	@JsonIgnore
	private String pin;

	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImpl(Long id, String firstname,
			String lastname, String dateofbirth,
			String gender,String email,
			String mobileno, String address,
	    String city,
	    String state,
	    String country,
	    String pin,
			Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.firstname = firstname;
		this.lastname=lastname;
		this.dateofbirth=dateofbirth;
		this.gender=gender;
		this.email = email;
		this.mobileno=mobileno;
		this.address=address;
		this.city=city;
		this.state=state;
		this.country=country;
		this.pin=pin;
		this.authorities = authorities;
	}

	public static UserDetailsImpl build(User user) {
		List<GrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getName().name()))
				.collect(Collectors.toList());

		return new UserDetailsImpl(
				user.getId(), 
				user.getFirstname(),
				user.getLastname(),
				user.getDateofbirth(),
				user.getGender(),
				user.getEmail(),
				user.getMobileno(),
				user.getAddress(),
				user.getCity(),
				user.getState(),
				user.getCountry(),
				user.getPin(),
				authorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getLastname() {
		return lastname;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public String getMobileno() {
		return mobileno;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String getPassword() {
		return pin;
	}

	@Override
	public String getUsername() {
		return firstname;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user = (UserDetailsImpl) o;
		return Objects.equals(id, user.id);
	}
}
