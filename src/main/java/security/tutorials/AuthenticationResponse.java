package security.tutorials;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
public class AuthenticationResponse {

    private final String jwt;

}
