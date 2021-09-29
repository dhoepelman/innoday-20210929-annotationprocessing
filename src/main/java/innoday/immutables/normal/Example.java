package innoday.immutables.normal;

import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(
    allParameters = true,
    get = {"get*", "is*"},
    jdkOnly = true,
    passAnnotations = {Value.Immutable.class},
    strictBuilder = true)
public interface Example extends WithExample {
    String id();
    List<Integer> numbers();
    Optional<String> comment();
}
