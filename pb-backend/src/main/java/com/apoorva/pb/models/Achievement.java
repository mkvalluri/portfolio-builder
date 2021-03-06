package com.apoorva.pb.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Achievement {
    @Id
    @GeneratedValue
    private Integer id;
    private String achievement;
    @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn (name="pid")
    private Portfolio portfolio;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the achievement
     */
    public String getAchievement() {
        return achievement;
    }

    /**
	 * @param achievement the achievement to set
	 */
	public void setAchievement(String achievement) {
		this.achievement = achievement;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
    
    public Achievement(){

    }

    public Achievement(Integer id, String achievement){
        this.id=id;
        this.achievement=achievement;
    }
}

