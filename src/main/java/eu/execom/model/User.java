package eu.execom.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String email;
	
	@Column
	private String fullName;
	
	@Column
	private String password;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User userId;
	
	@OneToMany(mappedBy="pomodoro")
	private List<Pomodoro> pomodoros;
	
	public List<Pomodoro> getPomodoros() {
		return pomodoros;
	}

	public void setPomodoros(List<Pomodoro> pomodoros) {
		this.pomodoros = pomodoros;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

}
