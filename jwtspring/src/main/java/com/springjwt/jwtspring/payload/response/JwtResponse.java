package com.springjwt.jwtspring.payload.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private String refreshToken;
	private Long id;
	private String firstname;
	@NotBlank
	@Size(max = 50)
	private String lastname;
	@NotBlank
	@Size(max = 50)
	private String dateofbirth;
	@NotBlank
	@Size(max = 50)
	private String gender;

	private String email;

	@NotBlank
	@Size(max = 50)
	private String mobileno;
	@NotBlank
	@Size(max = 50)
	private String address;
	@NotBlank
	@Size(max = 50)
	private String city;
	@NotBlank
	@Size(max = 50)
	private String state;
	@NotBlank
	@Size(max = 50)
	private String country;

	@NotBlank
	@Size(max = 120)
	private String pin;

	private List<String> roles;

	public JwtResponse(String token,  String refreshToken, Long id, String firstname, String lastname,
			String dateofbirth, String gender, String email, String mobileno, String address, String city, String state,
			String country, String pin, List<String> roles) {
		this.token = token;
		this.type = type;
		this.refreshToken = refreshToken;
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.gender = gender;
		this.email = email;
		this.mobileno = mobileno;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
		this.roles = roles;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getRoles() {
		return roles;
	}

  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }
}
