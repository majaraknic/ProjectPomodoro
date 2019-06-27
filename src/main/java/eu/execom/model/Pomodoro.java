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
	@JoinColumn(name="id")
	private User id;

}
