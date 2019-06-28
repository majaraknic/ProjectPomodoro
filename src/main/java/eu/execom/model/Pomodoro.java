package eu.execom.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity(name = "Pomodoro")
public class Pomodoro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPomodoro;
	
	@Column
	private Date startDateTime;
	
	@Column
	private String status;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;

	public int getIdPomodoro() {
		return idPomodoro;
	}

	public void setIdPomodoro(int idPomodoro) {
		this.idPomodoro = idPomodoro;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getId() {
		return userId;
	}

	public void setId(User userId) {
		this.userId = userId;
	}

}
