package com.finance.smartbudget.mapping;

import com.finance.smartbudget.dto.TransactionDto;
import com.finance.smartbudget.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionsMapper {
    public TransactionDto convertEntity2Dto (Transaction transaction) {
        return new TransactionDto(
            transaction.getTransactionSum(),
            transaction.getCategory(),
            transaction.getBankId(),
            transaction.getDescription()
        );
    }
}
