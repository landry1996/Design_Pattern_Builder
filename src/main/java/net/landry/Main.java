package net.landry;

import net.landry.model.AccountStatus;
import net.landry.model.AccountType;
import net.landry.model.BankAccount;
import net.landry.model.BankDirector;

public class Main {
    public static void main(String[] args) {



        BankAccount bankAccount= BankDirector.accountBuilder()
                .accountId(1L)
                .currency("MAD")
                .status(AccountStatus.CREATED)
                .type(AccountType.SAVING_ACCOUNT)
                .balance(700000) .
                build();

        System.out.println(bankAccount.toString());
    }
}