// unique entry point to get access to all assertThat methods and utility methods (e.g. entry)
import static org.assertj.core.api.Assertions.*;

// common assertions
assertThat(frodo.getName()).isEqualTo("Frodo");
assertThat(frodo).isNotEqualTo(sauron)
                 .isIn(fellowshipOfTheRing);

// String specific assertions
assertThat(frodo.getName()).startsWith("Fro")
                           .endsWith("do")
                           .isEqualToIgnoringCase("frodo");

// collection specific assertions
assertThat(fellowshipOfTheRing).hasSize(9)
                               .contains(frodo, sam)
                               .doesNotContain(sauron);

// using extracting magical feature to check fellowshipOfTheRing characters name :)
assertThat(fellowshipOfTheRing)
	.extracting("name")
	.contains("Boromir", "Gandalf", "Frodo", "Legolas")
	.doesNotContain("Sauron", "Elrond");

// map specific assertions, ringBearers initialized with the elves rings and the one ring bearers.
assertThat(ringBearers).hasSize(4)
                       .contains(entry(oneRing, frodo), entry(nenya, galadriel))
                       .doesNotContainEntry(oneRing, aragorn);

// and many more assertions : dates, file, numbers, exceptions ...