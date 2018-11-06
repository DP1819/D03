
package domain;

import java.util.Collection;

import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Referee extends Actor {

	//----------Relaciones-----------

	private Collection<Report>	reports;


	//----------Getters y Setters-------

	@NotNull
	@Valid
	@OneToMany(mappedBy = "report")
	public Collection<Report> getReports() {
		return this.reports;
	}

	public void setReports(final Collection<Report> reports) {
		this.reports = reports;
	}

}
