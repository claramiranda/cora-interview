package corabank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Main {

    @Autowired
    Conta_acesso repositorio;

    @GetMapping("/health")
    String health() {
        return "Live!";
    }

    @PostMapping("/{id}")
    Account get(@PathVariable("id") Integer id) {
        return repositorio.findById(id).get();
    }


    @PostMapping ("/createAccount")
    ResponseEntity<Account> createAccount(@RequestBody Account account) {

        // 1- Metodo POST - OK
        // 2 - Dados estão sendo setador hardcoded e não pegam parametros OK
        // 3 - Endereço do endpoint não está explicito (seguindo padrões) OK
        // 4 - Id sendo recebido por parametro OK
        // 5 - Retornar código HTTP de sucesso OK

        System.out.printf(account.toString());

        repositorio.save(account);

        return ResponseEntity.ok(account);

    }




//    String atualizar() {
//        Account account = new Account();
//        account.name = "Conta Cora";
//        account.active = true;
//
//        // Atualizando conta
//        repositorio.save(account);
//
//        if (account.balance > 0) {
//
//            // Sacando 5
//            account.balance = account.balance - 5;
//
//            // Atualizando conta
//            repositorio.save(account);
//
//            // Implrimindo saldo
//            System.out.println("- Balance: " + account.balance);
//
//        } else {
//            System.out.println("Não foi possível atualizar!");
//        }
//        return "Teste Atualizar";
//    }

}
