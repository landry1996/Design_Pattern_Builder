package net.landry.repository;

import net.landry.model.BankAccount;
import net.landry.model.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {

    private Map<Long, BankAccount> bankAccountMap = new HashMap<>();
    private long accountsCount=0;

    @Override
    public BankAccount save(BankAccount bankAccount) {
         Long accountId=++accountsCount;
         bankAccount.setAccountId(accountId);
         bankAccountMap.put(accountId,bankAccount);
         return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount account = bankAccountMap.get(id);
        if (account==null)
            return Optional.empty();
        else
        return Optional.of(account);
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {

        return bankAccountMap.values().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount account) {
        bankAccountMap.put(account.getAccountId(),account);
        return account;
    }

    @Override
    public void deleteById(Long id) {
       bankAccountMap.remove(id);
    }
    public void populateData(){
        for (int i = 0; i<10; i++){

            BankAccount account = BankDirector.accountBuilder().build();
        }
    }
}
