package ac.za.cput.domain;

import java.util.Objects;

public class Job {

    private String jobTible;

    public String myJobTitle()
    {
        return jobTible;
    }

    public Job(Builder builder)
    {
        this.jobTible = builder.jobTitle;
    }


    public static class Builder{
        private String jobTitle;

        public Builder jobTitle(String jobTitle)
        {
            this.jobTitle = jobTitle;
            return this;
        }

        public Job build()
        {
            return new Job(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return jobTible.equals(job.jobTible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobTible);
    }
}
