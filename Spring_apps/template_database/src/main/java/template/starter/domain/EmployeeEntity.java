package template.starter.domain;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {
	@Id
	private int id;
	private int no;
	private String name;
	private String team;
	public EmployeeEntity(){
		
	}
	public EmployeeEntity(int id, String name, String team, int no)
	{this.id=id;
	this.name=name;
	this.team=team;
	this.no=no;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
}
