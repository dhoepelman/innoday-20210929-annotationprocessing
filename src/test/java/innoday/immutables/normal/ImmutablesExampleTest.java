package innoday.immutables.normal;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class ImmutablesExampleTest {

  @Test
  public void testOf() {
    var example = ImmutableExample.of("1", List.of(4, 5, 6), Optional.of("Just some example"));

    assertThat(example).isNotNull();
  }

  @Test
  public void testBuilder() {
    var example =
        ImmutableExample.builder().id("1").addNumbers(4, 5, 6).comment("Just some example");

    assertThat(example).isNotNull();
  }
}
