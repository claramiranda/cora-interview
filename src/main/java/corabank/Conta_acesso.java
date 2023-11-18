package corabank;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Conta_acesso extends JpaRepository<Account, Integer> {

}
