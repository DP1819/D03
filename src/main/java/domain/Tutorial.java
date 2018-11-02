
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

public class Tutorial extends DomainEntity {

	// Properties

	private Date				moment;
	private String				title;
	private String				summary;
	private Collection<String>	pictures;

	//-------------Relaciones--------------

	private HandyWorker			handyWorker;
	private Collection<Section>	sections;
	private Collection<Sponsorship> sponsorships;


	//-------------Getters y Setters--------

	@NotNull
	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	@NotNull
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	@NotNull
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	@URL
	public Collection<String> getPictures() {
		return this.pictures;
	}

	public void setPictures(final Collection<String> pictures) {
		this.pictures = pictures;
	}

	@NotNull
	@Valid
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	@NotNull
	@Valid
	@NotEmpty
	public Collection<Section> getSection() {
		return this.sections;
	}

	public void setSection(final Collection<Section> sections) {
		this.sections = sections;
	}
	
	@NotNull
	@Valid
	@NotEmpty
	public Collection<Section> getSections() {
		return sections;
	}

	public void setSections(Collection<Section> sections) {
		this.sections = sections;
	}

	@NotNull
	@Valid
	public Collection<Sponsorship> getSponsorships() {
		return sponsorships;
	}

	public void setSponsorships(Collection<Sponsorship> sponsorships) {
		this.sponsorships = sponsorships;
	}

	
	
}