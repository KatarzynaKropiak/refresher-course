package org.patterns.builder.developer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeveloperTest {
    @Test
    void testDeveloperNew() {
        //Given
        Developer backend = new Developer.Builder()
                .java(17)
                .motivation("High")
                .framework("Spring")
                .technology("Git")
                .framework("Hibernate")
                .skill("Quick Learning Ability")
                .skill("Excellent Analytical Skills")
                .technology("JBDC, MySQL")
                .skill("Good Time and Task Management")
                .build();

        System.out.println(backend);
        //When
        String searchedSkill = "Spring";
        //Then
        assertTrue(backend.getFrameworks().contains(searchedSkill));
    }
}
