package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank
    @Size(min = 1, max = 150)
    private String description;

    public Skill (@NotBlank @Size(min = 1, max =150) String description) {
        this.description = description;
    }

    public Skill () {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList();
}