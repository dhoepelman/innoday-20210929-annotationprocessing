package innoday.immutables.record;

import java.util.List;
import java.util.Optional;
import org.immutables.builder.Builder;


public record ARecord(String id, List<Integer> numbers, Optional<String> comment) {
    @Builder.Constructor public ARecord {}
}

//@Builder.Constructor
//public record ARecord(String id, List<Integer> numbers, Optional<String> comment) {
//}
