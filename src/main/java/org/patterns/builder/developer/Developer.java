package org.patterns.builder.developer;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
public final class Developer {
    private final int java;
    private final String motivation;
    private final List<String> frameworks;
    private final List<String> technologies;
    private List<String> skills;


    private Developer(int java, String motivation, List<String> frameworks, List<String> technologies, List<String> skills) {
        this.java = java;
        this.motivation = motivation;
        this.frameworks = frameworks;
        this.technologies = technologies;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "You should hire me, because I have a "
                + String.join(", ", skills) + " and I know how to use "
                + String.join(", ",frameworks) + ", "
                + String.join(", ",technologies) + " and Java " + java + ".";
    }

    static class Builder {
        private int  java;
        private String motivation;
        private final List<String> frameworks = new ArrayList<>();
        private final List<String> technologies = new ArrayList<>();
        private final List<String> skills = new ArrayList<>();

        public Builder java(int java) {
            this.java = java;
            return this;
        }

        public Builder motivation(String motivation) {
            this.motivation = motivation;
            return this;
        }

        public Builder framework(String framework) {
            frameworks.add(framework);
            return this;
        }

        public Builder technology(String technology) {
            technologies.add(technology);
            return this;
        }

        public Builder skill(String skill) {
            skills.add(skill);
            return this;
        }

        public Developer build() {
            return new Developer(java, motivation, frameworks, technologies, skills);

        }
    }

}