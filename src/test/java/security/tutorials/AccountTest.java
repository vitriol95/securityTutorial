package security.tutorials;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class AccountTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void 회원저장(){
        Account account = Account.builder()
                .accountName("user")
                .password("1234")
                .active(true)
                .roles("ROLE_USER")
                .build();
        accountRepository.save(account);
    }

}