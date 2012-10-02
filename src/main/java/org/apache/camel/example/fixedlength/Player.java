package org.apache.camel.example.fixedlength;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

/**
 * 
 * 
Here we are processing a fixed length record in below format

Name, Debut Date, Country , Mathes palyed, Runs scored, Average, Strike rate, Batting posion, Reteriment Date
 
Rahul Dravid      1996-09-10INDIA       00160   593060.54180.54 42012-09-01
Sachin Tendulkar  1989-09-10INDIA       00140   600064.54140.54 42012-09-01
Steve Waugh       1993-09-10AUSTRALIA   00140   900072.54180.54 42012-09-01
Kevin Peterson    1999-09-10INDIA       00140   640020.54150.54 42012-09-01
Adam Gilcrist     1996-09-10AUSTRALIA   00140   670077.54160.54 42012-09-01


 *  @author santosh joshi (santoshjoshi2003@gmail.com)
 *  
 */
@FixedLengthRecord(length=75, paddingChar=' ')
public class Player implements Serializable {

	
private static final long serialVersionUID = 1L;
	
	@DataField(pos = 1, length=18, trim=true, align="L")
	private String name;

	@DataField(pos = 19, length=10, pattern = "yyyy-MM-dd")
	private Date debutDate;
	
	@DataField(pos = 29, length=12, trim=true, align="L")
	private String country;
	
	@DataField(pos = 41, length=5, paddingChar='0', trim=true)
	private int matchesPlayed;
	
	@DataField(pos = 46, length=6, paddingChar=' ', trim=true)
	private Integer runsScored;
	
	@DataField(pos = 52, length=6, paddingChar='0', precision= 2)
	private float averageRunRate;
	
	@DataField(pos = 58, length=6, precision= 2)
	private BigDecimal strikeRate;
	
	@DataField(pos = 64, length=2, paddingChar=' ', trim=true)
	private int batingPosition;
	
	@DataField(pos = 66, length=10, pattern = "yyyy-MM-dd", defaultValue="2021-12-31")
	private Date retirementDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDebutDate() {
		return debutDate;
	}

	public void setDebutDate(Date debutDate) {
		this.debutDate = debutDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public Integer getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(Integer runsScored) {
		this.runsScored = runsScored;
	}

	public float getAverageRunRate() {
		return averageRunRate;
	}

	public void setAverageRunRate(float averageRunRate) {
		this.averageRunRate = averageRunRate;
	}

	public BigDecimal getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(BigDecimal strikeRate) {
		this.strikeRate = strikeRate;
	}

	public int getBatingPosition() {
		return batingPosition;
	}

	public void setBatingPosition(int batingPosition) {
		this.batingPosition = batingPosition;
	}

	public Date getRetirementDate() {
		return retirementDate;
	}

	public void setRetirementDate(Date retirementDate) {
		this.retirementDate = retirementDate;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", debutDate=" + new SimpleDateFormat("yyyy-MM-dd").format(debutDate)
				+ ", country=" + country + ", matchesPlayed=" + matchesPlayed
				+ ", runsScored=" + runsScored + ", averageRunRate="
				+ averageRunRate + ", strikeRate=" + strikeRate
				+ ", batingPosition=" + batingPosition + ", retirementDate="
				+ new SimpleDateFormat("yyyy-MM-dd").format(retirementDate) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((debutDate == null) ? 0 : debutDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (debutDate == null) {
			if (other.debutDate != null)
				return false;
		} else if (!debutDate.equals(other.debutDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
