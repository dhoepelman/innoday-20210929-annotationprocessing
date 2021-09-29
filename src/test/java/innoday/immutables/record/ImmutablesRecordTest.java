package innoday.immutables.record;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class ImmutablesRecordTest {

  @Test
  public void testPlainRecord() {
    var record = new ARecord("1", List.of(1, 2, 3), Optional.of("A plain record"));

    assertThat(record.id()).isEqualTo("1");
    assertThat(record.numbers()).containsExactly(1, 2, 3);
    assertThat(record.comment()).contains("A plain record");
  }

  @Test
  public void testBuilder() {
    var example =
        new ARecordBuilder().id("1").addNumbers(4, 5, 6).comment("Just some example").build();

    assertThat(example).isNotNull();
  }

  //  public void testWither() {
  //    var original = new ARecord("1", List.of(), Optional.empty());
  //
  //    assertThat(original).isNotNull();
  //  }

}
